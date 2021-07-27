package com.atguigu.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * @author Gang Han
 * @date 2021-07-27
 */
@SpringBootApplication
@EnableEurekaClient
public class CloudGateway9527Application {
    public static void main(String[] args) {
        SpringApplication.run(CloudGateway9527Application.class, args);
        System.out.println("启动成功");
    }
}
