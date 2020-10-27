package com.kevin.dubbo.demo.consumer;

import com.kevin.demo.api.service.OrderService;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.io.IOException;

/**
 * create by kevin.
 *
 * @Date 2020/10/27
 */
public class ConsumerApplication {

    public static void main(String[] args) throws IOException {

        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("consumer.xml");
        OrderService orderService = context.getBean(OrderService.class);
        orderService.initOrder("1");
        System.in.read();
    }

}
