/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mench.bean;

import java.time.LocalDateTime;

/**
 *
 * @author pathachi
 */
public class Subscription {
    
    
    int subscriptionId;			
    LocalDateTime subStartDate;			
    LocalDateTime subChargeDate;			
    LocalDateTime subscriptionEndDate;			
    double subscriptionCost;			
    boolean  ifdiscountApply;			
    boolean   isactive;			
    String discountType;			
    String subscriptionType;			
    int userId;			
    int accountId;

    public int getSubscriptionId() {
        return subscriptionId;
    }

    public void setSubscriptionId(int subscriptionId) {
        this.subscriptionId = subscriptionId;
    }

    public LocalDateTime getSubStartDate() {
        return subStartDate;
    }

    public void setSubStartDate(LocalDateTime subStartDate) {
        this.subStartDate = subStartDate;
    }

    public LocalDateTime getSubChargeDate() {
        return subChargeDate;
    }

    public void setSubChargeDate(LocalDateTime subChargeDate) {
        this.subChargeDate = subChargeDate;
    }

    public LocalDateTime getSubscriptionEndDate() {
        return subscriptionEndDate;
    }

    public void setSubscriptionEndDate(LocalDateTime subscriptionEndDate) {
        this.subscriptionEndDate = subscriptionEndDate;
    }

    public double getSubscriptionCost() {
        return subscriptionCost;
    }

    public void setSubscriptionCost(double subscriptionCost) {
        this.subscriptionCost = subscriptionCost;
    }

    public boolean isIfdiscountApply() {
        return ifdiscountApply;
    }

    public void setIfdiscountApply(boolean ifdiscountApply) {
        this.ifdiscountApply = ifdiscountApply;
    }

    public boolean isIsactive() {
        return isactive;
    }

    public void setIsactive(boolean isactive) {
        this.isactive = isactive;
    }

    public String getDiscountType() {
        return discountType;
    }

    public void setDiscountType(String discountType) {
        this.discountType = discountType;
    }

    public String getSubscriptionType() {
        return subscriptionType;
    }

    public void setSubscriptionType(String subscriptionType) {
        this.subscriptionType = subscriptionType;
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public int getAccountId() {
        return accountId;
    }

    public void setAccountId(int accountId) {
        this.accountId = accountId;
    }
}
