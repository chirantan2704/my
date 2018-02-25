/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mench.dao;

import com.mench.bean.Account;
import java.util.List;

/**
 *
 * @author pathachi
 */
public interface AccountDao {
    
      public void addAccount(Account account);
 
//    public void editAccount(Bundle bundle, String bundleId);
 
  //  public void deleteBundle(String bundleId);
 
  //  public User find(String bundleId);
 
    public List < Account > findAll();
    
}
