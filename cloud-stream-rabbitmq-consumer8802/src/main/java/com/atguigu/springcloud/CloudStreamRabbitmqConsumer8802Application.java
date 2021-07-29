package com.atguigu.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @author Gang Han
 * @date 2021-07-28
 */
@SpringBootApplication
public class CloudStreamRabbitmqConsumer8802Application {
    public static void main(String[] args) {
        SpringApplication.run(CloudStreamRabbitmqConsumer8802Application.class, args);
        System.out.println("启动成功");
    }
}
