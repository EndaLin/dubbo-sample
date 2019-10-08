package com.enda.service.impl;

import com.enda.domain.User;
import com.enda.service.UserProviderService;
import org.apache.dubbo.config.annotation.Service;
import org.springframework.stereotype.Component;

import java.util.Arrays;
import java.util.List;

@Service
@Component
public class UserProviderServiceImpl implements UserProviderService {

    @Override
    public List<User> getUserList(String userId) {
        User user = new User();
        user.setId(1);
        user.setName("enda");
        return Arrays.asList(user);
    }
}
