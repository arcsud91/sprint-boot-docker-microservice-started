package com.chatiya.controller;

import com.chatiya.entities.User;
import com.chatiya.repositories.UserRepository;
import com.chatiya.util.CryptoUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpRequest;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RestController
@RequestMapping("/auth")
public class AuthController extends BaseController{

    private UserRepository userRepository;
    private CryptoUtil cryptoUtil;

    @Autowired
    public AuthController(UserRepository userRepository, CryptoUtil cryptoUtil) {
        this.userRepository = userRepository;
        this.cryptoUtil = cryptoUtil;
    }

    @RequestMapping(value = "/signup", method = RequestMethod.POST)
    public ResponseEntity signUp(@RequestBody Map<String, Object> payload) {
        String name = (String) payload.get("name");
        String mobile = (String) payload.get("mobile");
        String email = (String) payload.get("email");
        String password = (String) payload.get("password");
        final User user = new User();
        user.setEmail(email);
        user.setMobile(mobile);
        user.setName(name);
        String hashedPassword = cryptoUtil.hashPassword(password);
        user.setPassword(hashedPassword);
        userRepository.save(user);
        return ResponseEntity.ok().build();
    }


}
