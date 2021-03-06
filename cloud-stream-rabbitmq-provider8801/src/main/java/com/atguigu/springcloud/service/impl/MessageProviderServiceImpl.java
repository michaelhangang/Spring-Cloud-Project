package com.atguigu.springcloud.service.impl;

import com.atguigu.springcloud.service.IMessageProviderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.stream.annotation.EnableBinding;
import org.springframework.cloud.stream.messaging.Source;
import org.springframework.integration.support.MessageBuilder;
import org.springframework.messaging.Message;
import org.springframework.messaging.MessageChannel;

import java.util.UUID;

/**
 * @author Gang Han
 * @date 2021-07-28
 * @EnableBinding(Source.class) 定义消息的推送管道 将Channel和Exchanges绑定在一起
 */
@EnableBinding(Source.class)
public class MessageProviderServiceImpl implements IMessageProviderService {
    @Autowired
    private MessageChannel output;

    @Override
    public String send() {
        String serial = UUID.randomUUID().toString();
        Message<String> stringMessage = MessageBuilder.withPayload(serial).build();
        output.send(stringMessage);
        return serial;
    }
}
