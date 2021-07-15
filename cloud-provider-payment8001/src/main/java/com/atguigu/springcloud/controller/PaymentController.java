package com.atguigu.springcloud.controller;

import com.alibaba.druid.sql.visitor.functions.If;
import com.atguigu.springcloud.entities.CommonResult;
import com.atguigu.springcloud.entities.Payment;
import com.atguigu.springcloud.service.PaymentService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * @author Gang Han
 * @date 2021-07-13
 */
@RestController
@Slf4j
public class PaymentController {
    @Autowired
    private PaymentService paymentService;

    @PostMapping("/payment")
    public CommonResult create(@RequestBody Payment payment){
       int result = paymentService.create(payment);
       log.info("insert result is "+result);
       if (result>0) {
           return new CommonResult(200, "insert successfully", result);
       }else
        return new CommonResult(444, "insert failed!"+result, null);
    }

    @GetMapping("/payment/{id}")
    public CommonResult getPaymentById(@PathVariable("id") Long id){
        Payment result = paymentService.getPaymentById(id);
        log.info("get result is "+result);
        if (result!=null) {
            return new CommonResult(200, "Query successfully", result);
        }
        return new CommonResult(444, "Query failed", null);
    }

}
