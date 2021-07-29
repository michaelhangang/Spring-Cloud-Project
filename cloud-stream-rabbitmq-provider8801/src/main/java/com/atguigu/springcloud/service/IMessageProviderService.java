package com.atguigu.springcloud.service;

/**
 * @author Gang Han
 * @date 2021-07-28
 */
public interface  IMessageProviderService {
    /**
     * 定义消息的推送管道
     *
     * @return
     */
    String send();
}
