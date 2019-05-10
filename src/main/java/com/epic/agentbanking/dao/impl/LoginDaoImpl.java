/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.epic.agentbanking.dao.impl;

import com.epic.agentbanking.common.AbstractDAO;
import com.epic.agentbanking.dao.LoginDao;
import com.epic.agentbanking.model.Page;
import com.epic.agentbanking.model.Pagesectionuserrole;
import com.epic.agentbanking.model.Users;
import java.security.MessageDigest;
import java.security.Provider;
import java.security.Security;
import java.util.Iterator;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.bouncycastle.jce.provider.BouncyCastleProvider;
import org.hibernate.Criteria;
import org.hibernate.criterion.Restrictions;
import org.springframework.stereotype.Repository;

/**
 *
 * @author shalini_w
 */
@Repository("LoginDao")
public class LoginDaoImpl extends AbstractDAO<String, Users> implements LoginDao {

    @Override
    public Users findUserbyUsername(String username) {
        return getByKey(username);
    }

    @Override
    public List<Pagesectionuserrole> getPageList(String userrolecode, String section) {
        Criteria criteria = getSession().createCriteria(Pagesectionuserrole.class);
        return (List<Pagesectionuserrole>)criteria.list();
    }

    @Override
    public List<Page> getAllPageList() {
        Criteria criteria = getSession().createCriteria(Page.class);
        return (List<Page>)criteria.list();
    }

    @Override
    public Users findUserDatabyUsernameandPassword(String username, String password) {
        Users user = null;
        try {
            String encPassword = this.makeHash(password);
            
            Criteria cr = getSession().createCriteria(Users.class);
            cr.add(Restrictions.eq("username", username));
            cr.add(Restrictions.eq("password", encPassword));
            List results = cr.list();
            for (Iterator iterator = results.iterator(); iterator.hasNext();){
                user = (Users) iterator.next();
                System.out.print("User Name: " + user.getUsername());
            }
            
        } catch (Exception ex) {
            Logger.getLogger(LoginDaoImpl.class.getName()).log(Level.SEVERE, null, ex);
        }
        return user;
    }

    private String convertToHex(byte[] data) {
        StringBuilder buf = new StringBuilder();
        for (int i = 0; i < data.length; i++) {
            int halfbyte = (data[i] >>> 4) & 0x0F;
            int two_halfs = 0;
            do {
                if ((0 <= halfbyte) && (halfbyte <= 9)) {
                    buf.append((char) ('0' + halfbyte));
                } else {
                    buf.append((char) ('a' + (halfbyte - 10)));
                }
                halfbyte = data[i] & 0x0F;
            } while (two_halfs++ < 1);
        }
        return buf.toString();
    }

    public String makeHash(String input) throws Exception {
        try {
            Provider p = new BouncyCastleProvider();
            Security.addProvider(p);
            MessageDigest msd = MessageDigest.getInstance("SHA-1", p);
            byte d[] = msd.digest(input.getBytes());
            return convertToHex(d);
        } catch (Exception e) {
            return null;
        }
    }

}
