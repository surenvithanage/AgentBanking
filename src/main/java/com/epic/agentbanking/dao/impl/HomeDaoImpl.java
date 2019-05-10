/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.epic.agentbanking.dao.impl;

import com.epic.agentbanking.common.AbstractDAO;
import com.epic.agentbanking.dao.HomeDao;
import com.epic.agentbanking.model.Pagesectionuserrole;
import com.epic.agentbanking.model.Users;
import java.util.List;
import org.hibernate.Criteria;
import org.springframework.stereotype.Repository;

/**
 *
 * @author shalini_w
 */
@Repository("HomeDao")
public class HomeDaoImpl extends AbstractDAO<String, Users> implements HomeDao{

    @Override
    public List<Pagesectionuserrole> getPageList(String userrolecode, String section) {
        Criteria criteria = getSession().createCriteria(Pagesectionuserrole.class);
        return (List<Pagesectionuserrole>)criteria.list();
    }
    
}
