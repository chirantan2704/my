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
public class Account {
    int AccountId;
    int userId;
    double accountsOpbal;			
    double accountsClbal;			
    double accountsCredit;			
    double accountsDebit;			
    double accountsAvlbal;
    String accountType;			
    String currency;			
    LocalDateTime createdDate;			
    LocalDateTime createdBy;			
    LocalDateTime updatedDate;			
    LocalDateTime deactivationDate;

    public double getAccountsOpbal() {
        return accountsOpbal;
    }

    public void setAccountsOpbal(double accountsOpbal) {
        this.accountsOpbal = accountsOpbal;
    }

    public double getAccountsClbal() {
        return accountsClbal;
    }

    public void setAccountsClbal(double accountsClbal) {
        this.accountsClbal = accountsClbal;
    }

    public double getAccountsCredit() {
        return accountsCredit;
    }

    public void setAccountsCredit(double accountsCredit) {
        this.accountsCredit = accountsCredit;
    }

    public double getAccountsDebit() {
        return accountsDebit;
    }

    public void setAccountsDebit(double accountsDebit) {
        this.accountsDebit = accountsDebit;
    }

    public double getAccountsAvlbal() {
        return accountsAvlbal;
    }

    public void setAccountsAvlbal(double accountsAvlbal) {
        this.accountsAvlbal = accountsAvlbal;
    }

    public String getAccountType() {
        return accountType;
    }

    public void setAccountType(String accountType) {
        this.accountType = accountType;
    }

    public String getCurrency() {
        return currency;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }

    public LocalDateTime getCreatedDate() {
        return createdDate;
    }

    public void setCreatedDate(LocalDateTime createdDate) {
        this.createdDate = createdDate;
    }

    public LocalDateTime getCreatedBy() {
        return createdBy;
    }

    public void setCreatedBy(LocalDateTime createdBy) {
        this.createdBy = createdBy;
    }

    public LocalDateTime getUpdatedDate() {
        return updatedDate;
    }

    public void setUpdatedDate(LocalDateTime updatedDate) {
        this.updatedDate = updatedDate;
    }

    public LocalDateTime getDeactivationDate() {
        return deactivationDate;
    }

    public void setDeactivationDate(LocalDateTime deactivationDate) {
        this.deactivationDate = deactivationDate;
    }

    public int getAccountId() {
        return AccountId;
    }

    public void setAccountId(int AccountId) {
        this.AccountId = AccountId;
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }
    
}
