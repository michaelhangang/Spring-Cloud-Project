package com.atguigu.springcloud.service;

import com.atguigu.springcloud.entities.Payment;

/**
 * @author Gang Han
 * @date 2021-07-13
 */

public interface PaymentService {
    int create(Payment payment);
    Payment getPaymentById(Long id);
}
