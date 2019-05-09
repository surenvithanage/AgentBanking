/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.epic.agentbanking.service.impl;

import com.epic.agentbanking.dao.LoginDao;
import com.epic.agentbanking.model.Audittrace;
import com.epic.agentbanking.model.Page;
import com.epic.agentbanking.model.Pagesectionuserrole;
import com.epic.agentbanking.model.Section;
import com.epic.agentbanking.model.Task;
import com.epic.agentbanking.model.Users;
import com.epic.agentbanking.service.LoginService;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 *
 * @author shalini_w
 */
@Service("LoginService")
@Transactional
public class LoginServiceImpl implements LoginService{
    
    @Autowired
    private LoginDao loginDao;

    @Override
    public Users findUserbyUsername(String username) {
        return loginDao.findUserbyUsername(username);
    }

    @Override
    public List<Pagesectionuserrole> getPageList(String userrole, String section) {
        return loginDao.getPageList(userrole, section);
    }

    @Override
    public List<Page> getAllPageList() {
        return loginDao.getAllPageList();
    }

    @Override
    public Users findUserDatabyUsernameandPassword(String username, String password) {
        return loginDao.findUserDatabyUsernameandPassword(username, password);
    }
    
}
