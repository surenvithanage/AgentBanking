/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.epic.agentbanking.service.impl;

import com.epic.agentbanking.dao.HomeDao;
import com.epic.agentbanking.dao.impl.HomeDaoImpl;
import com.epic.agentbanking.model.Pagesectionuserrole;
import com.epic.agentbanking.service.HomeService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 *
 * @author shalini_w
 */
@Service("HomeService")
@Transactional
public class HomeServiceImpl implements HomeService{

    @Autowired
    private HomeDao homeDao;
    
    @Override
    public List<Pagesectionuserrole> getPageList(String userrolecode, String section) {
        return homeDao.getPageList(userrolecode, section);
    }
    
}
