package com.luv4code.service.notification.app;

import com.luv4code.amqp.RabbitMQMessageProducer;
import com.luv4code.service.notification.app.config.NotificationConfig;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.context.annotation.Bean;

@SpringBootApplication(scanBasePackages = {
        "com.luv4code.service.notification.app",
        "com.luv4code.amqp"
})
@EnableEurekaClient
public class NotificationServiceApplication {

    public static void main(String[] args) {
        SpringApplication.run(NotificationServiceApplication.class, args);
    }

   /* @Bean
    CommandLineRunner commandLineRunner(
            RabbitMQMessageProducer producer,
            NotificationConfig notificationConfig
    ) {
        return args -> {
            producer.publish(
                    new Person("Madhav", 28),
                    notificationConfig.getInternalExchange(),
                    notificationConfig.getInternalNotificationRoutingKey());
        };
    }

    @Data
    @NoArgsConstructor
    @AllArgsConstructor
    class Person {
        String name;
        int age;

    }*/

}
