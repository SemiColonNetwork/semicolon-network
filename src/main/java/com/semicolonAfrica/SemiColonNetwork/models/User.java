package com.semicolonAfrica.SemiColonNetwork.models;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Getter
@Setter
@ToString
@Document
public class User {
    @Id
    private String id;
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
