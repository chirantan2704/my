/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mench.dao;

import com.mench.bean.Product;
import com.mench.bean.Subscription;
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
@Qualifier("subscriptionDao")
public class SubscriptionDaoImpl implements SubscriptionDao {

    @Autowired
    JdbcTemplate jdbcTemplate;
    
    @Override
    public void addSubscription(Subscription subscription) {
        
           jdbcTemplate.update("INSERT INTO  subscriptions_master(subscription_id,sub_start_date,sub_charge_date,subscription_end_date,subscription_cost,ifdiscountApply,isactive,discount_type,subscription_type,user_id,account_id) VALUES (?, ?, ?, ?,?,?,?,?,?,?,?)",subscription.getSubscriptionId(),subscription.getSubStartDate(),subscription.getSubChargeDate(),subscription.getSubscriptionEndDate(),subscription.getSubscriptionCost(),subscription.isIfdiscountApply(),subscription.isIsactive(),subscription.getDiscountType(),subscription.getUserId(),subscription.getAccountId());
       
        
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
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
        
             List < Subscription > subscription = jdbcTemplate.query("SELECT * FROM subscriptions_master", new BeanPropertyRowMapper(Subscription.class));
        return subscription;
    
   //     throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
