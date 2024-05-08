package com.Climate.PrimeClimateCare.Controller;

import com.Climate.PrimeClimateCare.DTO.LoginDTO;
import com.Climate.PrimeClimateCare.DTO.MemberDTO;
import com.Climate.PrimeClimateCare.Response.LoginResponse;
import com.Climate.PrimeClimateCare.Service.MemberService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin
@Service
@RequestMapping(path = "api/v1/member")
public class MemberController {


    @Autowired
    private MemberService memberService;

    public MemberController(MemberService memberService) {
        this.memberService = memberService;
    }

    @PostMapping(path = "/save")
    public String saveMember(@RequestBody MemberDTO memberDTO){
        return memberService.addMember(memberDTO);
    }

    @PostMapping(path = "/login")
    public ResponseEntity<?> loginMember(@RequestBody LoginDTO loginDto){
        LoginResponse loginResponse = memberService.loginMember(loginDto);
        return  ResponseEntity.ok(loginResponse);
    }
}
