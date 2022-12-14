package com.usian;

import org.springframework.boot.SpringApplication;
import org.springframework.cloud.client.SpringCloudApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@EnableFeignClients
@SpringCloudApplication
public class ItemWebApp {
    public static void main(String[] args) {
        SpringApplication.run(ItemWebApp.class);
    }
}
