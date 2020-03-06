package com.enda.service.impl;

import com.enda.api.bean.UserInfo;
import com.enda.api.service.UserProviderService;
import org.apache.dubbo.config.annotation.Reference;
import org.springframework.stereotype.Service;

import java.util.List;


/**
 * @author Ienovo
 */
@Service
public class UserServiceImpl {

    @Reference
    private UserProviderService userProviderService;

    public List<UserInfo> InitUserInfo() {
        return userProviderService.getUserList();
    }
}
