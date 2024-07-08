package com.gila.challenge.notificationEmailService.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.JavaMailSenderImpl;

import java.util.Properties;

@Configuration
public class MessageEmailConfiguration {


@Autowired
  private CredentialsSmtpServer credentialsSmtpServer;
  public MessageEmailConfiguration(CredentialsSmtpServer credentialsSmtpServer){
    this.credentialsSmtpServer = credentialsSmtpServer;
  }


  @Bean
  public JavaMailSender getJavaMailSender() {
    JavaMailSenderImpl mailSender = new JavaMailSenderImpl();
    mailSender.setHost("smtp.gmail.com");
    mailSender.setPort(587);
    mailSender.setUsername(credentialsSmtpServer.getSmtpUserName());
    mailSender.setPassword(credentialsSmtpServer.getSmtpUserSecret());

    Properties properties = mailSender.getJavaMailProperties();
    properties.put("mail.transport.protocol", "smtp");
    properties.put("mail.smtp.auth", "true");
    properties.put("mail.smtp.starttls.enable", "true");
    properties.put("mail.debug", "true");
//    properties.put("mail.smtp.ssl.enable","true");

    return mailSender;
  }
}

