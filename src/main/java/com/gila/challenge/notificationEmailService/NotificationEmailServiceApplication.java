package com.gila.challenge.notificationEmailService;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class NotificationEmailServiceApplication implements CommandLineRunner {

  final static Logger logger = LoggerFactory.getLogger(NotificationEmailServiceApplication.class);

  public static void main(String[] args) {
    SpringApplication.run(NotificationEmailServiceApplication.class, args);
  }

  @Override
  public void run(String... args) throws Exception {
    logger.info("email service notification UP and running!!!");
  }
}
