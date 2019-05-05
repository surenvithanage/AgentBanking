package com.epic.agentbanking.service;

import com.epic.agentbanking.model.Users;

import java.util.List;

public interface     UserService {

    Users find(String username);

    void insert(Users user);

    void delete(String username);

    List<Users> list();

    void update(String username , Users user);

}
