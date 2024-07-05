package com.gila.challenge.notificationEmailService.consumer;

import com.gila.challenge.notificationEmailService.dto.MessageEvent;
import com.gila.challenge.notificationEmailService.service.MessageNotificationEmailService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Service;

@Service
public class MessageEmailConsumer {
  private final Logger LOGGER = LoggerFactory.getLogger(MessageEmailConsumer.class);

  private final MessageNotificationEmailService emailService;

  public MessageEmailConsumer (MessageNotificationEmailService emailService) {
    this.emailService = emailService;
  }

  @RabbitListener (queues = "${rabbitmq.queue.email.name}")
  public void consume(MessageEvent event) {

    LOGGER.info(String.format("Email event received => %s", event.toString()));

    emailService.sendNewMail(
            "ricardo@ferreiras.dev.br",
            "Message consumed by email services!",
            "Thank you for your services... :)"
    );

  }
}
