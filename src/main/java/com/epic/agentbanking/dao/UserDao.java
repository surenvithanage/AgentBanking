package com.epic.agentbanking.dao;

import com.epic.agentbanking.model.Users;

import java.util.List;

public interface UserDao {
    Users find(String username);

    void insert(Users user);

    void delete(String username);

    List<Users> list();

    void update(String username , Users user);
}
