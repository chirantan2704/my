/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mench.dao;

import com.mench.bean.Product;
import com.mench.bean.Subscription;
import com.mench.bean.SubscriptionBundle;
import com.mench.bean.User;
import java.time.LocalDateTime;
import java.util.ArrayList;
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
        
           jdbcTemplate.update("INSERT INTO  subscriptions_master(subscription_id,sub_start_date,sub_charge_date,subscription_end_date,subscription_cost,if_discount_apply,isactive,discount_type,subscription_type,user_id,account_id) VALUES (?, ?, ?, ?,?,?,?,?,?,?,?)",subscription.getSubscriptionId(),subscription.getSubStartDate(),subscription.getSubChargeDate(),subscription.getSubscriptionEndDate(),subscription.getSubscriptionCost(),subscription.isIfdiscountApply(),subscription.isIsactive(),subscription.getDiscountType(),subscription.getSubscriptionType(),subscription.getUserId(),subscription.getAccountId());
       
            List<SubscriptionBundle>subBundle = subscription.getSubscriptionBundle();
            int bundleSize =subBundle.size();
            
            for(int i = 0 ; i <  bundleSize ; i++ ){
                          SubscriptionBundle bundle =   subBundle.get(i);
                          
           jdbcTemplate.update("INSERT INTO  subscription_bundle_product(subscription_id,cost,is_active,added_date,deactivated_date,product_id,units,total_cost,bundle_id) VALUES (?, ?, ?, ?,?,?,?,?,?)",bundle.getSubscriptionId(),bundle.getCost(),bundle.isIsActive(),bundle.getAddedDate(),bundle.getDeactivatedDate(),bundle.getProductId(),bundle.getUnits(),bundle.gettotalCost(),bundle.getBundleId());
                       

            }
            
            int invoice_id = subscription.getSubscriptionId()+11000;
            String description = "invoice for subscription id " + subscription.getSubscriptionId(); 
            LocalDateTime invoiceDate = LocalDateTime.now();
            double invoiceTotalAmount=0.0;
            double invoiceAmount=1.0;
            double invoiceTaxAmount= invoiceAmount/20;
            String invoice_tax_id = "GST";
            invoiceTotalAmount = invoiceAmount + invoiceAmount; 
            
            
            jdbcTemplate.update("INSERT INTO  invoice_master(invoice_id,description,invoice_date,due_date,account_id,user_id,total_amount,invoice_tax_amount,invoice_amount,invoice_tax_id,invoice_total_no) VALUES (?, ?, ?, ?,?,?,?,?,?)",invoice_id,description,invoiceDate,invoiceDate,subscription.getAccountId(),subscription.getUserId(),invoiceTotalAmount,invoiceTaxAmount,invoiceAmount,invoice_tax_id,bundleSize);
           
         for(int i = 0 ; i <  bundleSize ; i++ ){
                          SubscriptionBundle bundle =   subBundle.get(i);
                          
                       
         jdbcTemplate.update("INSERT INTO  invoice_detail(invoice_id,invoice_seq_number,invoice_item_id,price,tax_code,quantity,round_flag) VALUES (?, ?, ?, ?,?,?,?,?,?)",invoice_id,i,bundle.getProductId(),bundle.getCost(),invoice_tax_id,bundle.getUnits(),false);
       
            }
            
         
            
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
