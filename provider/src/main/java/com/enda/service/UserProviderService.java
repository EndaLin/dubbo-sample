package com.enda.service;

import com.enda.domain.User;

import java.util.List;

public interface UserProviderService {

    List<User> getUserList(String userId);
}
