package com.enda.api.service;

import com.enda.api.bean.UserInfo;

import java.util.List;

/**
 * @author Ienovo
 */
public interface UserProviderService {

    /**
     * 获取用户列表
     */
    List<UserInfo> getUserList();
}
