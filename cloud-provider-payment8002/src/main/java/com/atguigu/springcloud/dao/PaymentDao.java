package com.atguigu.springcloud.dao;

import com.atguigu.springcloud.entities.Payment;
import org.apache.ibatis.annotations.Mapper;

/**
 * @author Gang Han
 * @date 2021-07-13
 */
@Mapper
public interface PaymentDao {
    int create(Payment payment);
    Payment getPaymentById(Long id);

}
