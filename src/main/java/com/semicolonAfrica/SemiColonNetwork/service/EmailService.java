package com.semicolonAfrica.SemiColonNetwork.service;

public interface EmailService {

    String sendEmail(EmailDetails emailDetails);

    String mimeMessage(EmailDetails emailDetails);


}
