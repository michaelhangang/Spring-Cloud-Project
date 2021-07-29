package com.atguigu.springcloud.controller;

import com.atguigu.springcloud.service.IMessageProviderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Gang Han
 * @date 2021-07-28
 */
@RestController
public class SendMessageController {
    @Autowired
    private IMessageProviderService messageProviderService;

    @GetMapping("/sendMessage")
    public String sendMessage() {
        return messageProviderService.send();
    }
}
