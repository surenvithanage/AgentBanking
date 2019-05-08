/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.epic.agentbanking.service;

import com.epic.agentbanking.model.Audittrace;
import com.epic.agentbanking.model.Page;
import com.epic.agentbanking.model.Section;
import com.epic.agentbanking.model.Task;
import com.epic.agentbanking.model.Users;
import java.util.Date;
import java.util.HashMap;
import java.util.List;

/**
 *
 * @author shalini_w
 */
public interface LoginService {
    
    Users findUserbyUsername(String username);
    Users findUserDatabyUsernameandPassword(String username,String password);
    Integer getPassparamcount(String paramcode);
    Boolean setUserPasswordStatus(Users user, Audittrace audit, String statuscode);
    Boolean updateUser(Users input, Audittrace audit, boolean login);
    HashMap<String, List<Page>> getPageSection(String userrole);
    HashMap<String, List<Task>> getPageTask(String userrolecode);
    HashMap<String, List<Task>> getAllPageTask();
    List<Page> getPageList(String userrole, String section);
    List<Page> getAllPageList();
    HashMap<String, Boolean> getAllPageListforDualAuth();
    List<Page> getAllSectionPageList(String section);
    List<Section> getSectionList(String userrole);
    List<Section> getAllSectionList();
    Date getCurrtime();
    String getUserString(Users usr);
    void saveLogoutAudit(Users u, Audittrace audit, boolean b);
    String findSectionByID(String hchoosesection);
    
}
