/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.epic.agentbanking.dao.impl;

import com.epic.agentbanking.common.AbstractDAO;
import com.epic.agentbanking.dao.LoginDao;
import com.epic.agentbanking.model.Audittrace;
import com.epic.agentbanking.model.Page;
import com.epic.agentbanking.model.Pagesectionuserrole;
import com.epic.agentbanking.model.Section;
import com.epic.agentbanking.model.Task;
import com.epic.agentbanking.model.Users;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.security.Provider;
import java.security.Security;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.bouncycastle.jce.provider.BouncyCastleProvider;
import org.hibernate.Criteria;
import org.hibernate.criterion.Criterion;
import org.hibernate.criterion.LogicalExpression;
import org.hibernate.criterion.Restrictions;
import org.springframework.stereotype.Repository;
import sun.misc.BASE64Encoder;

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
    public Integer getPassparamcount(String paramcode) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Boolean setUserPasswordStatus(Users user, Audittrace audit, String statuscode) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Boolean updateUser(Users input, Audittrace audit, boolean login) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public HashMap<String, List<Page>> getPageSection(String userrole) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public HashMap<String, List<Task>> getPageTask(String userrolecode) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public HashMap<String, List<Task>> getAllPageTask() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<Page> getPageList(String userrolecode, String section) {
        List<Page> pageList = null;
        
        Criteria cr = getSession().createCriteria(Pagesectionuserrole.class);
        
//            Criterion userrole =  Restrictions.eq("userrole", userrolecode);
//            Criterion sec =  Restrictions.eq("section", section);
//            LogicalExpression exp = Restrictions.and(userrole, sec);
//            cr.add(exp);
            cr.add(Restrictions.eq("section", section));
            List results = cr.list();
            for (Iterator iterator = results.iterator(); iterator.hasNext();){
                Pagesectionuserrole psu = (Pagesectionuserrole)iterator.next();
                
                Page page = psu.getPage();
                System.out.println("################"+page.getDescription());
                pageList.add(page);
            }
        return pageList;
    }

    @Override
    public List<Page> getAllPageList() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public HashMap<String, Boolean> getAllPageListforDualAuth() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<Page> getAllSectionPageList(String section) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<Section> getSectionList(String userrole) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<Section> getAllSectionList() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Date getCurrtime() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public String getUserString(Users usr) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void saveLogoutAudit(Users u, Audittrace audit, boolean b) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public String findSectionByID(String hchoosesection) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
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
