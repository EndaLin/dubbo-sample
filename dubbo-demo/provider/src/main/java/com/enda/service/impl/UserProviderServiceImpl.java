package com.enda.service.impl;


import com.enda.api.bean.UserInfo;
import com.enda.api.service.UserProviderService;

import org.apache.dubbo.config.annotation.Service;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Ienovo
 */
@Service
@Component
public class UserProviderServiceImpl implements UserProviderService {

    private static List<UserInfo> userInfoList = new ArrayList<>();

    static {
        UserInfo userInfo1 = new UserInfo(1, "java");
        UserInfo userInfo2 = new UserInfo(2, "scala");
        userInfoList.add(userInfo1);
        userInfoList.add(userInfo2);
    }

    @Override
    public List<UserInfo> getUserList() {
        return userInfoList;
    }
}
