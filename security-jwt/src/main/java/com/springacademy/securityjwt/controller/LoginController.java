package com.springacademy.securityjwt.controller;

import com.springacademy.securityjwt.dto.LoginRequest;
import com.springacademy.securityjwt.dto.LoginResponse;
import com.springacademy.securityjwt.service.JwtService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LoginController {

    @Autowired
    private JwtService jwtService;

    // authentication = logging
    @PostMapping({"/authentication"})
    public LoginResponse createJwtTokenLogin(@RequestBody LoginRequest loginRequest) throws Exception{
        System.out.println(loginRequest);
        return jwtService.createJwtToken(loginRequest);

    }
}
