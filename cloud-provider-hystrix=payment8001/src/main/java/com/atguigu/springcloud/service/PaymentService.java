package com.atguigu.springcloud.service;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixProperty;
import org.springframework.stereotype.Service;

import java.util.concurrent.TimeUnit;

/**
 * @author Gang Han
 * @date 2021-07-17
 */
@Service
public class PaymentService {
    public String paymentInfo_ok(Integer id){
        return "threadpool: "+ Thread.currentThread().getName()+" paymentInfo_Ok,id: "+id;
    }


    @HystrixCommand(fallbackMethod = "paymentInfo_timeoutHandler", commandProperties = {
            @HystrixProperty(name = "execution.isolation.thread.timeoutInMilliseconds", value = "3000")    })
    public String paymentInfo_timeout(Integer id){
        //      int age = 10/0;
//        int time =2;
//        try {
//            TimeUnit.MILLISECONDS.sleep(3000);
//        } catch (InterruptedException e) {
//            e.printStackTrace();
//        }

        return "threadpool: "+ Thread.currentThread().getName()+" paymentInfo_timeout,id: "+id;
    }

    public String paymentInfo_timeoutHandler(Integer id){
        return "fallback method!";
    }


}
