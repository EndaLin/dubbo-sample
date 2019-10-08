package com.enda.service.impl;

import com.alibaba.fastjson.JSON;
import com.enda.service.UserProviderService;
import org.apache.dubbo.config.annotation.Reference;
import org.springframework.stereotype.Component;


@Component
public class UserService {

    @Reference
    private UserProviderService userProviderService;

    public String run(String name) {
        return JSON.toJSONString(userProviderService.getUserList(name));
    }
}
