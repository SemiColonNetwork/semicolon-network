package com.semicolonAfrica.SemiColonNetwork.service;

import com.semicolonAfrica.SemiColonNetwork.dtos.SaveUserRequest;
import com.semicolonAfrica.SemiColonNetwork.models.User;

public interface UserService {

    String saveUser (SaveUserRequest saveUserRequest);
}
