/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.epic.agentbanking.dao;

import com.epic.agentbanking.model.Page;
import com.epic.agentbanking.model.Pagesectionuserrole;
import com.epic.agentbanking.model.Users;
import java.util.List;

/**
 *
 * @author shalini_w
 */
public interface LoginDao {
    
    Users findUserbyUsername(String username);
    Users findUserDatabyUsernameandPassword(String username,String password);
    List<Pagesectionuserrole> getPageList(String userrole, String section);
    List<Page> getAllPageList();
    
}
