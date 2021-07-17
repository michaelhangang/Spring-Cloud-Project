package com.atguigu.springcloud.controller;

import com.atguigu.springcloud.entities.CommonResult;
import com.atguigu.springcloud.entities.Payment;
import com.atguigu.springcloud.service.PaymentService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.*;

import java.util.concurrent.TimeUnit;

/**
 * @author Gang Han
 * @date 2021-07-13
 */
@RestController
@Slf4j
public class PaymentController {
    @Autowired
    private PaymentService paymentService;
    @Value("${server.port}")
    private String serverPort;
    @PostMapping("/payment")
    public CommonResult create(@RequestBody Payment payment){
       int result = paymentService.create(payment);
       log.info("insert result is "+result);
       if (result>0) {
           return new CommonResult(200, "insert successfully,serverPort: "+serverPort, result);
       }else
        return new CommonResult(444, "insert failed!"+result, null);
    }

    @GetMapping("/payment/{id}")
    public CommonResult getPaymentById(@PathVariable("id") Long id){
        Payment result = paymentService.getPaymentById(id);
        log.info("get result is "+result);
        if (result!=null) {
            return new CommonResult(200, "Query successfully,serverPort: "+serverPort, result);
        }
        return new CommonResult(444, "Query failed", null);
    }
    @GetMapping("/payment/feign/timeout")
    public String paymentFeignTimeout() {
        try {
            TimeUnit.SECONDS.sleep(3);
        }catch (InterruptedException e) {
            e.printStackTrace();
        }

        return serverPort;
    }
}
