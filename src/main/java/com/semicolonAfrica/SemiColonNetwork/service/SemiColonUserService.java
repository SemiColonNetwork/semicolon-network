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

    @Override
    public User saveUser(SaveUserRequest saveUserRequest) {
        User user = modelMapper.map(saveUserRequest, User.class);
        return userRepository.save(user);
    }
}
