package com.semicolonAfrica.SemiColonNetwork.service;

import jakarta.mail.MessagingException;
import jakarta.mail.internet.MimeMessage;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.JavaMailSenderImpl;
import org.springframework.mail.javamail.MimeMessageHelper;
import org.springframework.stereotype.Service;


@Service
public class SemiColonNetworkEmailService implements EmailService{
@Autowired
    private JavaMailSender javaMailSender;

    @Value("${spring.mail.username}")
    private String sender;

    @Override
    public String sendEmail(EmailDetails details)
    {
        try {
            SimpleMailMessage mailMessage
                    = new SimpleMailMessage();
            mailMessage.setFrom(sender);
            mailMessage.setTo(details.getRecipient());
            mailMessage.setText(details.getMsgBody());
            mailMessage.setSubject(details.getSubject());
            javaMailSender.send(mailMessage);
            return "Mail Sent Successfully...";
        }
        catch (Exception e) {
            System.out.println(e.getMessage());
            return "Error while Sending Mail";
        }
    }

    @Override
    public String mimeMessage(EmailDetails emailDetails) {
        MimeMessage mimeMessage = javaMailSender.createMimeMessage();
        try {
            MimeMessageHelper helper = new MimeMessageHelper(mimeMessage, true);
            helper.setFrom(sender);
        helper.setTo(emailDetails.getRecipient());
        helper.setSubject(emailDetails.getSubject());
        helper.setText(emailDetails.getMsgBody(), true);
        javaMailSender.send(mimeMessage);
        return "Sent";
        } catch (MessagingException e) {
            throw new RuntimeException(e);
        }
    }
}
