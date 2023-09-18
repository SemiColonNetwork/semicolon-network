package com.semicolonAfrica.SemiColonNetwork.service;

import com.semicolonAfrica.SemiColonNetwork.dtos.SaveUserRequest;
import com.semicolonAfrica.SemiColonNetwork.models.User;
import com.semicolonAfrica.SemiColonNetwork.repository.UserRepository;
import lombok.AllArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
@AllArgsConstructor
public class SemiColonUserService implements UserService{

    private UserRepository userRepository;

    private final ModelMapper modelMapper;

    private EmailService emailService;

    private final static String response = "Thank you, we will get back to you shortly!";

    @Override
    public String saveUser(SaveUserRequest saveUserRequest) throws Exception {
        List<User> users = new ArrayList<>(userRepository.findAll());
        boolean bool = false;
        for (User user : users) {
            if (user.getEmailAddress().equals(saveUserRequest.getEmailAddress())) throw new Exception("Sorry, you cannot register twice");
        }
        User user = modelMapper.map(saveUserRequest, User.class);
        userRepository.save(user);
        if(users.size()%10 == 0)emailService.sendEmail(EmailDetails.builder().recipient("semicolonnetwork1@gmail.com").msgBody("You have 10 New Records and a total of " + users.size() + " records").subject("New records").build());

        return response;
    }
}
