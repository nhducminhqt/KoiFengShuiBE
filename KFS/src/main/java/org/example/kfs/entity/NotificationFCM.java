package org.example.kfs.entity;

import lombok.Data;

@Data
public class NotificationFCM {
    String title;
    String message;
    String fcmToken;

}
