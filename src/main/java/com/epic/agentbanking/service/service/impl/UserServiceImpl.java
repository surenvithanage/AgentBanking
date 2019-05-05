package com.epic.agentbanking.service.service.impl;

import com.epic.agentbanking.dao.UserDao;
import com.epic.agentbanking.model.Users;
import com.epic.agentbanking.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service("UserService")
@Transactional
public class UserServiceImpl implements UserService {

    @Autowired
    private UserDao userDao;

    @Override
    public Users find(String username) {
        return userDao.find(username);
    }

    @Override
    public void insert(Users user) {
        userDao.insert(user);
    }

    @Override
    public void delete(String username) {
        userDao.delete(username);
    }

    @Override
    public List<Users> list() {
        return userDao.list();
    }

    @Override
    public void update(String username, Users user) {
        userDao.update(username,user);
    }
}
