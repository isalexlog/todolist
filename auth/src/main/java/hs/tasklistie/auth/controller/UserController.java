package hs.tasklistie.auth.controller;

import hs.tasklistie.auth.dataTransferObject.LoginDto;
import hs.tasklistie.auth.dataTransferObject.SignupDto;
import hs.tasklistie.auth.service.UserService;
import hs.tasklistie.auth.web.ApiResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;

@RestController
@RequestMapping("/")
public class UserController {

    @Autowired
    private UserService userService;

    @PostMapping("/registrieren")
    public ApiResponse signUp(@Valid @RequestBody SignupDto signupDto){ return userService.signUp(signupDto); }

    @PostMapping("/login")
    public ApiResponse login(@Valid @RequestBody LoginDto loginDto){
        return userService.login(loginDto);
    }

}
