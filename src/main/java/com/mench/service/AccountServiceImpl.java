/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mench.service;

import com.mench.bean.Account;
import com.mench.dao.AccountDao;
import com.mench.dao.BundleProductDao;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author pathachi
 */
@Service("accountService")
public class AccountServiceImpl implements AccountService{

     @Autowired
    AccountDao accountDao;
     
    @Override
    public void addAccount(Account account) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<Account> findAll() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
