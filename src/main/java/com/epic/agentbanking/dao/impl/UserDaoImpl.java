package com.epic.agentbanking.dao.impl;

import com.epic.agentbanking.common.AbstractDAO;
import com.epic.agentbanking.dao.UserDao;
import com.epic.agentbanking.model.Users;
import org.hibernate.Criteria;
import org.hibernate.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository("UserDao")
public class UserDaoImpl extends AbstractDAO<String , Users> implements UserDao {
    @Override
    public Users find(String username) {
        return getByKey(username);
    }

    @Override
    public void insert(Users user) {
        insert(user);
    }

    @Override
    public void delete(String username) {
        Query query = getSession().createSQLQuery("delete from users where username = :username ");
        query.setString("username" , username);
        query.executeUpdate();
    }

    @Override
    public List<Users> list() {
        Criteria criteria = createEntityCriteria();
        return (List<Users>)criteria.list();
    }

    @Override
    public void update(String username, Users user) {
        Users userinfo = find(username);
        if(userinfo != null){
            userinfo.setAttempts(user.getAttempts());
            userinfo.setFullname(user.getFullname());
            userinfo.setExpirydate(user.getExpirydate());
            userinfo.setPassword(user.getPassword());
            userinfo.setUserrole(user.getUserrole());
            userinfo.setUsersbranches(user.getUsersbranches());
            userinfo.setStatusByPasswordstatus(user.getStatusByPasswordstatus());
            userinfo.setStatusByStatus(user.getStatusByStatus());
            if(userinfo != null){
                insert(userinfo);
            }
        }
    }
}
