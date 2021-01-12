package com.example.auth.service.impl;

import com.example.auth.entity.CostomUser;
import com.example.auth.repository.UserRepository;
import com.example.auth.service.LoginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class LoginServiceImpl implements LoginService {

    @Autowired
    private UserRepository userRepository;

    @Override
    public String login(String username, String password) {
        CostomUser costomUser = userRepository.findByName(username);
        if(costomUser == null){
            return "false";
        }
        if (costomUser.getPass().equals(password)) {
            return "true";
        } else {
            return "false";
        }
    }
}
