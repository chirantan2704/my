/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mench.dao;

import com.mench.bean.Subscription;
import com.mench.bean.SubscriptionBundle;
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
@Qualifier("subscriptionBundleDao")
public class SubscriptionBundleDaoImpl implements SubscriptionBundleDao{

  @Autowired
  JdbcTemplate jdbcTemplate ;
  
     
    @Override
    public void addSubscriptionBundle(SubscriptionBundle subscriptionBundle) {
        
 jdbcTemplate.update("INSERT INTO  subscription_bundle_product(subscription_id, cost, isActive,added_date,deactivated_date,product_id,units,total_cost,bundle_id) VALUES (?, ?, ?, ?,?,?,?,?,?)",
           subscriptionBundle.getSubscriptionId(),subscriptionBundle.getCost(),subscriptionBundle.isIsActive(),subscriptionBundle.getAddedDate(),subscriptionBundle.getDeactivatedDate(),subscriptionBundle.getProductId(),subscriptionBundle.getUnits(),subscriptionBundle.gettotalCost(),subscriptionBundle.getBundleId());
             
        
//    throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<SubscriptionBundle> findAll() {
        
               List < SubscriptionBundle > subscriptionBundle = jdbcTemplate.query("SELECT * FROM subscription_bundle_product", new BeanPropertyRowMapper(SubscriptionBundle.class));
        return subscriptionBundle;
    
     //   throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
