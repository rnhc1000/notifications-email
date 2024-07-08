package com.gila.challenge.notificationEmailService.config;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Configuration
public class CredentialsSmtpServer {

  @Value ("${credentials.smtp.username}")
  private String smtpUserName;

  @Value ("${credentials.smtp.secret}")
  private String smtpUserSecret;


}
