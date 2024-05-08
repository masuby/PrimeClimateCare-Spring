package com.Climate.PrimeClimateCare.Service;

import com.Climate.PrimeClimateCare.DTO.LoginDTO;
import com.Climate.PrimeClimateCare.DTO.MemberDTO;
import com.Climate.PrimeClimateCare.Entity.Member;
import com.Climate.PrimeClimateCare.Repository.MemberRepository;
import com.Climate.PrimeClimateCare.Response.LoginResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class MemberServiceImpl implements MemberService {

    @Autowired
    private MemberRepository memberRepository;

    @Autowired
    private PasswordEncoder passwordEncoder;

    @Override
    public String addMember(MemberDTO memberDTO) {

        Member member = new Member(
                memberDTO.getMemberId(),
                memberDTO.getMemberName(),
                memberDTO.getPhoneNumber(),
                memberDTO.getEmail(),

                this.passwordEncoder.encode(memberDTO.getPassword())
        );

        memberRepository.save(member);

        return member.getMemberName();
    }

    @Override
    public LoginResponse loginMember(LoginDTO loginDTO) {
        String msg="";
        Member member1=memberRepository.findByEmailOrPhoneNumber(loginDTO.getEmail(),loginDTO.getPhoneNumber());
        if(member1 !=null){
            String password=loginDTO.getPassword();
            String encodedPassword=member1.getPassword();
            boolean isPwdRight = passwordEncoder.matches(password, encodedPassword);
            if(isPwdRight){
                Optional<Member> member = memberRepository.findOneByEmailOrPhoneNumberAndPassword(loginDTO.getEmail(), loginDTO.getPhoneNumber(), encodedPassword);
                if(member.isPresent()){
                    return  new LoginResponse("Login Success", true);

                }
                else{
                    return new LoginResponse("Login Failed", false);
                }
            }
            else{
                return  new LoginResponse("password not match", false);
            }

        }
        else{
            return new LoginResponse("Email  not exists", false);
        }
    }


}
