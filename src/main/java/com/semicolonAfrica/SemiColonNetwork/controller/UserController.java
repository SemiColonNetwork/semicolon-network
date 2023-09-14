package com.semicolonAfrica.SemiColonNetwork.controller;

import com.semicolonAfrica.SemiColonNetwork.dtos.SaveUserRequest;
import com.semicolonAfrica.SemiColonNetwork.service.UserService;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@AllArgsConstructor
public class UserController {

    private UserService userService;

    @PostMapping("/join")
    public ResponseEntity<?> saveUser(@RequestBody SaveUserRequest saveUserRequest){
       var response =  userService.saveUser(saveUserRequest);
        return ResponseEntity.status(HttpStatus.CREATED).body(response);
    }

}
