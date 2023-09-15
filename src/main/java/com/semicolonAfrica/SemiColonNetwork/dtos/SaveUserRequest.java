package com.semicolonAfrica.SemiColonNetwork.dtos;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class SaveUserRequest {
   private String id;
    private String fullName;
    private String emailAddress;
    private String phoneNumber;
    private String stack;
    private String cohort;
    private String proficientLanguage;
    private String ancestorOrNative;
    private String employmentStatus;
}
