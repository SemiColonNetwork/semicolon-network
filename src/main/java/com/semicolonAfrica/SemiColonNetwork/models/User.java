package com.semicolonAfrica.SemiColonNetwork.models;

import com.mongodb.annotations.ThreadSafe;
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
    private String stack;
    private String cohort;
    private String proficientLanguage;
    private String ancestorOrNative;
    private String employmentStatus;
}
