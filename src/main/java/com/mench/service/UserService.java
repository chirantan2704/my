/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mench.service;

import com.mench.bean.User;
import java.util.List;

/**
 *
 * @author pathachi
 */
public interface UserService {
    
    public void addUser(User user);
 
    public void editUser(User user, int personId);
 
    public void deleteUser(int personId);
 
    public User find(int personId);
 
    public List < User > findAll();
 
    public boolean isUserExist(User user);
}
