package com.module03.module03;

import org.springframework.jms.annotation.JmsListener;
import org.springframework.stereotype.Component;

@Component
public class Receiver {

    @JmsListener(destination = "order-queue")
    public void receiveMessage(String order){
        System.out.println("Order Recieved = " + order);
    }
}
