package com.wqw.study.ioc.service.impl;

import com.wqw.study.ioc.bean.User;
import com.wqw.study.ioc.dao.UserDao;
import com.wqw.study.ioc.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserDao userDao;

    @Override
    public User get() {
        return userDao.getUser();
    }
}
