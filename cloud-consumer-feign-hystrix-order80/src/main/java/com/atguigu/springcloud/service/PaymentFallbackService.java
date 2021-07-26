package com.atguigu.springcloud.service;

import org.springframework.stereotype.Component;

/**
 * @author Gang Han
 * @date 2021-07-26
 */
@Component
public class PaymentFallbackService implements PaymentHystrixService{
    @Override
    public String paymentInfo_Ok(Integer id) {
        return "PaymentFallbackService-paymentInfo_Ok ";
    }

    @Override
    public String paymentInfo_Timeout(Integer id) {
        return "PaymentFallbackService-paymentInfo_Timeout ";
    }
}
