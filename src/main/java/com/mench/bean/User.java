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
public class User {

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getCellPhone() {
        return cellPhone;
    }

    public void setCellPhone(String cellPhone) {
        this.cellPhone = cellPhone;
    }

    public String getEmailId() {
        return emailId;
    }

    public void setEmailId(String emailId) {
        this.emailId = emailId;
    }

    public String getUserType() {
        return userType;
    }

    public void setUserType(String userType) {
        this.userType = userType;
    }

    public LocalDateTime getActivationDate() {
        return activationDate;
    }

    public void setActivationDate(LocalDateTime activationDate) {
        this.activationDate = activationDate;
    }

    public LocalDateTime getDeactivationDate() {
        return deactivationDate;
    }

    public void setDeactivationDate(LocalDateTime deactivationDate) {
        this.deactivationDate = deactivationDate;
    }

    public String getAccountMumber() {
        return accountMumber;
    }

    public void setAccountMumber(String accountMumber) {
        this.accountMumber = accountMumber;
    }
    
String userId;			
String cellPhone;			
String emailId	;		
String userType;			
LocalDateTime activationDate;			
LocalDateTime deactivationDate;			
String accountMumber;
    
    
}
