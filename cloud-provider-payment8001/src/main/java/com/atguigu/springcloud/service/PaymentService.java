package com.atguigu.springcloud.service;

import com.atguigu.springcloud.entities.Payment;
import org.apache.ibatis.annotations.Param;

/**
 * @author Gang Han
 * @date 2021-07-13
 */

public interface PaymentService {
    int create(Payment payment);
    Payment getPaymentById(Long id);
}
