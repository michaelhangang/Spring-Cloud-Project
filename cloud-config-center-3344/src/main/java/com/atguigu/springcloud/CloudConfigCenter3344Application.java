package com.atguigu.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

/**
 * @author Gang Han
 * @date 2021-07-27
 */
@SpringBootApplication
@EnableConfigServer
public class CloudConfigCenter3344Application {
    public static void main(String[] args) {
        SpringApplication.run(CloudConfigCenter3344Application.class, args);
        System.out.println("启动成功");

    }
}
