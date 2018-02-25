/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mench.service;

import com.mench.bean.Subscription;
import com.mench.bean.User;
import java.util.List;

/**
 *
 * @author pathachi
 */
public interface SubscriptionService {
     public void addSubscription(Subscription subscription);
 
    public void editSubscription(Subscription subscription, String subscriptionId);
 
    public void deleteSubscription(String subscriptionId);
 
    public User find(String subscriptionId);
 
    public List < Subscription > findAll();
}
