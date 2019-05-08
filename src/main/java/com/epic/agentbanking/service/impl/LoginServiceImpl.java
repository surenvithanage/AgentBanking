/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.epic.agentbanking.service.impl;

import com.epic.agentbanking.dao.LoginDao;
import com.epic.agentbanking.model.Audittrace;
import com.epic.agentbanking.model.Page;
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
    public Integer getPassparamcount(String paramcode) {
        return loginDao.getPassparamcount(paramcode);
    }

    @Override
    public Boolean setUserPasswordStatus(Users user, Audittrace audit, String statuscode) {
        return loginDao.setUserPasswordStatus(user, audit, statuscode);
    }

    @Override
    public Boolean updateUser(Users input, Audittrace audit, boolean login) {
        return loginDao.updateUser(input, audit, login);
    }

    @Override
    public HashMap<String, List<Page>> getPageSection(String userrole) {
        return loginDao.getPageSection(userrole);
    }

    @Override
    public HashMap<String, List<Task>> getPageTask(String userrolecode) {
        return loginDao.getPageTask(userrolecode);
    }

    @Override
    public HashMap<String, List<Task>> getAllPageTask() {
        return loginDao.getAllPageTask();
    }

    @Override
    public List<Page> getPageList(String userrole, String section) {
        return loginDao.getPageList(userrole, section);
    }

    @Override
    public List<Page> getAllPageList() {
        return loginDao.getAllPageList();
    }

    @Override
    public HashMap<String, Boolean> getAllPageListforDualAuth() {
        return loginDao.getAllPageListforDualAuth();
    }

    @Override
    public List<Page> getAllSectionPageList(String section) {
        return loginDao.getAllSectionPageList(section);
    }

    @Override
    public List<Section> getSectionList(String userrole) {
        return loginDao.getSectionList(userrole);
    }

    @Override
    public List<Section> getAllSectionList() {
        return loginDao.getAllSectionList();
    }

    @Override
    public Date getCurrtime() {
        return loginDao.getCurrtime();
    }

    @Override
    public String getUserString(Users usr) {
        return loginDao.getUserString(usr);
    }

    @Override
    public void saveLogoutAudit(Users u, Audittrace audit, boolean b) {
        loginDao.saveLogoutAudit(u, audit, b);
    }

    @Override
    public String findSectionByID(String hchoosesection) {
        return loginDao.findSectionByID(hchoosesection);
    }

    @Override
    public Users findUserDatabyUsernameandPassword(String username, String password) {
        return loginDao.findUserDatabyUsernameandPassword(username, password);
    }
    
}
