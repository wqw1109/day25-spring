package com.wqw.study.ioc.dao.impl;

import com.wqw.study.ioc.bean.User;
import com.wqw.study.ioc.dao.UserDao;
import org.springframework.stereotype.Repository;

@Repository
public class UserDaoImpl implements UserDao {
    @Override
    public User getUser() {
        User user = new User();
        user.setName("wqw");
        return user;
    }
}
