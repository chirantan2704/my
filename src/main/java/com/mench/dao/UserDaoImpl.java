/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mench.dao;

import com.mench.bean.User;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

/**
 *
 * @author pathachi
 */
@Repository
@Qualifier("personDao")
public class UserDaoImpl implements UserDao{

    @Autowired
    JdbcTemplate jdbcTemplate;
    
    @Override
    public void addUser(User user) {
        
        jdbcTemplate.update("INSERT INTO  Users(cell_phone, email_id, user_type,activation_date,deactivation_date,account_number) VALUES (?, ?, ?, ?,?,?)",
            Integer.parseInt(user.getCellPhone()),user.getEmailId(),user.getActivationDate(),user.getDeactivationDate(),user.getAccountMumber(),0);
        System.out.println("user Added!");
       // throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
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
        
         List < User > persons = jdbcTemplate.query("SELECT * FROM users", new BeanPropertyRowMapper(User.class));
        return persons;
      //  throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public String findWithEmailId(String emailId) {
        
    String userId = (String) jdbcTemplate.queryForObject("SELECT user_id FROM User where email_id = ? ",
            new Object[] { emailId }, new BeanPropertyRowMapper(User.class));
 
        return userId;
     //   throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
