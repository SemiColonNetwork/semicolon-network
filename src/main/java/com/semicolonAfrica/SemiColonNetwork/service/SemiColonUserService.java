package com.semicolonAfrica.SemiColonNetwork.service;

import com.semicolonAfrica.SemiColonNetwork.dtos.SaveUserRequest;
import com.semicolonAfrica.SemiColonNetwork.models.User;
import com.semicolonAfrica.SemiColonNetwork.repository.UserRepository;
import lombok.AllArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

import java.time.Duration;
import java.time.LocalDateTime;
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
        for (User user : users) {
            if (user.getEmailAddress().equals(saveUserRequest.getEmailAddress()) || user.getPhoneNumber().equals(saveUserRequest.getPhoneNumber())) throw new Exception("Sorry, you cannot register with the same Email or Phone Number");
        }
        User user = modelMapper.map(saveUserRequest, User.class);
        LocalDateTime localDateTime = LocalDateTime.now();
        user.setTimeRegistered(timeRegistered(localDateTime));
        userRepository.save(user);
        String message = Template.mailTemplate(saveUserRequest.getFullName());
        emailService.mimeMessage(EmailDetails.builder().recipient(saveUserRequest.getEmailAddress()).msgBody(message).subject("Welcome").build());
        if(users.size()%10 == 0)emailService.sendEmail(EmailDetails.builder().recipient("semicolonnetwork1@gmail.com").msgBody("You have 10 New Records and a total of " + users.size() + " records").subject("New records").build());

        return response;
    }

    public String timeRegistered(LocalDateTime localDateTime){
        Duration duration = Duration.between(localDateTime, LocalDateTime.now());
        long hours = duration.toHours();
        if (hours > 24) return String.format("Registered %s hours ago",hours);
        else return String.format("Registered %s days ago", duration.toDays());
    };

}
