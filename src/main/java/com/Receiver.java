package com;

import org.springframework.amqp.rabbit.annotation.RabbitHandler;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

/**
 * Created by Administrator on 2017/12/13.
 */
@Component
@RabbitListener(queues = "spring-boot-queue")
public class Receiver {
    @RabbitHandler
    public void process(String hello) {
        System.out.println("==========================================Receiver : " + hello);
    }
}
