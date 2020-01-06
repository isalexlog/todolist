package hs.tasklistie.auth.service;

import hs.tasklistie.auth.dataAccessObject.UserDao;
import hs.tasklistie.auth.dataTransferObject.LoginDto;
import hs.tasklistie.auth.dataTransferObject.SignupDto;
import hs.tasklistie.auth.exceptions.NoUserFoundException;
import hs.tasklistie.auth.exceptions.PasswordMismatchException;
import hs.tasklistie.auth.exceptions.UsernameAlreadyInUseException;
import hs.tasklistie.auth.exceptions.WrongPasswordException;
import hs.tasklistie.auth.model.User;
import hs.tasklistie.auth.web.ApiResponse;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Profile;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;

//@Profile("h2")
@Transactional
@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserDao userDao;
    @Autowired
    private BCryptPasswordEncoder encoder;

    @Override
    public ApiResponse signUp(SignupDto signupDto) {
        User user = new User();
        if(userDao.findByUsername(signupDto.getUsername()) != null){
            throw new UsernameAlreadyInUseException();
        }
        if(!signupDto.getPassword().equals(signupDto.getPasswordConfirm())) {
            throw new PasswordMismatchException();
        }
        BeanUtils.copyProperties(signupDto, user);
        user.setPassword(encoder.encode(user.getPassword()));
        userDao.save(user);
        return new ApiResponse(200, "Sie haben sich erfolgreich registriert!", user);
    }

    @Override
    public ApiResponse login(LoginDto loginDto) {
        User user = userDao.findByUsername(loginDto.getUsername());
        if(user == null) {
            throw new NoUserFoundException();
        }
        if(!encoder.matches(loginDto.getPassword(), user.getPassword())) {
            throw new WrongPasswordException();
        }
        return new ApiResponse(200, "Sie sind jetzt eingeloggt!", null) ;
    }
}
