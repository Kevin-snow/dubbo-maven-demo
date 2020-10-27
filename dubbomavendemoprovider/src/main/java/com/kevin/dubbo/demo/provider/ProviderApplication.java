package com.kevin.dubbo.demo.provider;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.io.IOException;

/**
 * create by kevin.
 *
 * @Date 2020/10/27
 */
public class ProviderApplication {

    public static void main(String[] args) throws IOException {
        ClassPathXmlApplicationContext ioc = new ClassPathXmlApplicationContext("provider.xml");

        System.in.read();
    }
    
    
}
