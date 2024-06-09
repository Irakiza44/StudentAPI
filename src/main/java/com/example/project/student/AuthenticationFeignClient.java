package com.example.project.student;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.*;

//@FeignClient(name = "SPRINGSECURITY", url = "${spring.security.url}")
////@FeignClient(name = "SPRINGSECURITY")
//public interface AuthenticationFeignClient {
//
//    @PostMapping("/auth/signup")
//    public User register(@RequestBody RegisterUserDto registerUserDto);
//
//    @PostMapping("/auth/login")
//    public LoginResponse authenticate(@RequestBody LoginUserDto loginUserDto);
//
//}
@FeignClient(name = "SPRINGSECURITY", url = "${spring.security.url}")
public interface AuthenticationFeignClient {
    @PostMapping("/auth/signup")
    User register(@RequestBody RegisterUserDto registerUserDto);

    @PostMapping("/auth/login")
    LoginResponse authenticate(@RequestBody LoginUserDto loginUserDto);
}
