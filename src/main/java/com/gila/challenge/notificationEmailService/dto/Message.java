package com.gila.challenge.notificationEmailService.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.Instant;
@AllArgsConstructor
@NoArgsConstructor
@Data
public class Message {
  private String message;
  private String name;
  private String phone;
  private String email;
  private Instant createdAt;
  private String messageId;
}
