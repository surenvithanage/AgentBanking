/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.epic.agentbanking.dao;

import com.epic.agentbanking.model.Pagesectionuserrole;
import java.util.List;

/**
 *
 * @author shalini_w
 */
public interface HomeDao {
     List<Pagesectionuserrole> getPageList(String userrolecode, String section);
}
