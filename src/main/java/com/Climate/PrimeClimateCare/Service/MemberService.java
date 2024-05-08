package com.Climate.PrimeClimateCare.Service;

import com.Climate.PrimeClimateCare.DTO.LoginDTO;
import com.Climate.PrimeClimateCare.DTO.MemberDTO;
import com.Climate.PrimeClimateCare.Response.LoginResponse;
import org.springframework.stereotype.Service;

@Service
public interface MemberService{

    String addMember(MemberDTO memberDTO);

    LoginResponse loginMember(LoginDTO loginDto);

}
