/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mench.service;

import com.mench.bean.Account;
import com.mench.bean.User;
import com.mench.dao.AccountDao;
import com.mench.dao.UserDao;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author pathachi
 */
@Service("userService")
public class UserServiceImpl implements UserService{

    @Autowired
    UserDao userDao;
    
     @Autowired
    AccountDao accountDao;
    
    @Override
    public void addUser(User user) {
        
        userDao.addUser(user);
        
        String userId = userDao.findWithEmailId(user.getEmailId());
        
        if(userId!=null){
        Account account = new Account();
        account.setAccountId(Integer.parseInt(userId));
        account.setUserId(Integer.parseInt(userId));
        accountDao.addAccount(account);
       }
     //   throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void editUser(User user, int personId) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void deleteUser(int personId) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    
    
    @Override
    public User find(int personId) {
        
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<User> findAll() {
       // System.out.println(userDao.findAll());
        
       List<User> user= userDao.findAll();
       // throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
     return user;
    }
    
    @Override
    public boolean isUserExist(User user){
        
       String userId = userDao.findWithEmailId(user.getEmailId());
       if(userId=="" || userId==null){
        return true;
    }
       return false;
    }
}
