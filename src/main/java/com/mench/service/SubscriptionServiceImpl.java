/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mench.service;

import com.mench.bean.Subscription;
import com.mench.bean.User;
import com.mench.dao.ProductDao;
import com.mench.dao.SubscriptionDao;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author pathachi
 */
@Service("subscriptionService")
public class SubscriptionServiceImpl implements SubscriptionService{

     @Autowired
    SubscriptionDao subscriptionDao;
    
    @Override
    public void addSubscription(Subscription subscription) {
        
        subscriptionDao.addSubscription(subscription);
     //   throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void editSubscription(Subscription subscription, String subscriptionId) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void deleteSubscription(String subscriptionId) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public User find(String subscriptionId) {
        
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<Subscription> findAll() {
     
        return subscriptionDao.findAll();
      //  throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
