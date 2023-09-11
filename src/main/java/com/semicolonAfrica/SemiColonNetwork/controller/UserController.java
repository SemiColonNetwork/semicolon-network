package com.semicolonAfrica.SemiColonNetwork.controller;

import com.semicolonAfrica.SemiColonNetwork.dtos.SaveUserRequest;
import com.semicolonAfrica.SemiColonNetwork.service.UserService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@AllArgsConstructor
public class UserController {

    private UserService userService;

    public String saveUser(@RequestBody SaveUserRequest saveUserRequest){
        userService.saveUser(saveUserRequest);
        return "User saved succesffully";
    }

}
