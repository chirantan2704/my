/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mench.service;

import com.mench.bean.SubscriptionBundle;
import com.mench.dao.ProductDao;
import com.mench.dao.SubscriptionBundleDao;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;

/**
 *
 * @author pathachi
 */
public class SubscriptionBundleServiceImpl implements SubscriptionBundleService{

        @Autowired
       SubscriptionBundleDao subscriptionBundleDao;
        
    @Override
    public void addSubscriptionBundle(SubscriptionBundle subBundle) {
        subscriptionBundleDao.addSubscriptionBundle(subBundle);
   //     throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<SubscriptionBundle> findAll() {
       return subscriptionBundleDao.findAll();
    //    throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
