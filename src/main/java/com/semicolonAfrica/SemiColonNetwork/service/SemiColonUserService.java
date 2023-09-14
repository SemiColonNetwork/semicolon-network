package com.semicolonAfrica.SemiColonNetwork.service;

import com.semicolonAfrica.SemiColonNetwork.dtos.SaveUserRequest;
import com.semicolonAfrica.SemiColonNetwork.models.User;
import com.semicolonAfrica.SemiColonNetwork.repository.UserRepository;
import lombok.AllArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class SemiColonUserService implements UserService{

    private UserRepository userRepository;

    private final ModelMapper modelMapper;

    private final static String response = "Thank you, we will get back to you shortly!";

    @Override
    public String saveUser(SaveUserRequest saveUserRequest) {
        User user = modelMapper.map(saveUserRequest, User.class);
        userRepository.save(user);
        return response;
    }
}
