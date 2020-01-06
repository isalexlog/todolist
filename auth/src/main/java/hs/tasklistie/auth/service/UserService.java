package hs.tasklistie.auth.service;

import hs.tasklistie.auth.dataTransferObject.LoginDto;
import hs.tasklistie.auth.dataTransferObject.SignupDto;
import hs.tasklistie.auth.web.ApiResponse;

public interface UserService {

    ApiResponse signUp(SignupDto signupDto);

    ApiResponse login(LoginDto loginDto);

}
