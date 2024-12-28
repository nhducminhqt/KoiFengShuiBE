package org.example.kfs.service;

public interface EmailService {
    void sendEmail(String from, String to, String subject, String body);
}
