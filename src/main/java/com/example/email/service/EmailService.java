package com.example.email.service;

import com.example.email.entity.Email;
import jakarta.mail.MessagingException;
import org.springframework.http.ResponseEntity;

public interface EmailService {
    ResponseEntity<String> sendEmail(Email email) throws MessagingException;
}
