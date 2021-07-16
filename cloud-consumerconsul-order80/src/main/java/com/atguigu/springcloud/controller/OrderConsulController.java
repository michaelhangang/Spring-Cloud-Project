package com.atguigu.springcloud.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

/**
 * @author Gang Han
 * @date 2021-07-16
 */
@RestController
@Slf4j
public class OrderConsulController {
    public static final String INVOKE="http://consul-provider-payment";

    @Autowired
    private RestTemplate restTemplate;

    @GetMapping("/consumer/consul")
    public String paymentInfo(){
        String result = restTemplate.getForObject(INVOKE+"/payment/consul",String.class);
        return result;
    }
}
