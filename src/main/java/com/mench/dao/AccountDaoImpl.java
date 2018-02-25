/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mench.dao;

import com.mench.bean.Account;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

/**
 *
 * @author pathachi
 */
@Repository
@Qualifier("accountDao")
public class AccountDaoImpl implements AccountDao{

    @Autowired
    JdbcTemplate jdbcTemplate;
    
    
    @Override
    public void addAccount(Account account) {
       
        jdbcTemplate.update("INSERT INTO  accounts_master(accounts_id,user_id) VALUES (?,?)",
                    account.getAccountId(),account.getUserId());
   
        
        
        
     //  throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<Account> findAll() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
