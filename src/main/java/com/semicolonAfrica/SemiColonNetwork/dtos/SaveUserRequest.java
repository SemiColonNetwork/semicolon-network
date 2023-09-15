package com.semicolonAfrica.SemiColonNetwork.dtos;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class SaveUserRequest {
    private String fullName;
    private String emailAddress;
    private String phoneNumber;
    private String cohort;
    private boolean isAncestor;
    private boolean isNative;
    private boolean isEmployed;
    private String techStack;
    private String language;
}
