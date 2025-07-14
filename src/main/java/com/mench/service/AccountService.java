/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mench.service;

import com.mench.bean.Account;
import com.mench.bean.Bundle;
import com.mench.bean.User;
import java.util.List;

/**
 *
 * @author pathachi
 */
public interface AccountService {
    
     public void addAccount(Account account);
 //addding comment
//    public void editAccount(Bundle bundle, String bundleId);
 
  //  public void deleteBundle(String bundleId);
 
  //  public User find(String bundleId);
 
    public List < Account > findAll();

    public User findworld(String bundleId);

     public User findworldNearMe(String bundleId);
    
}
