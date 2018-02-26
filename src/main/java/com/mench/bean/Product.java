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
public class Product {
 
   String     productId;			
   String     productName;			
   String     description;			
   LocalDateTime introDate;			
   LocalDateTime endDate;			
   boolean       isactive;			
   double        costCurrent;			
   double        costIntroTime;

    public String getProductId() {
        return productId;
    }

    public void setProductId(String productId) {
        this.productId = productId;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public LocalDateTime getIntroDate() {
        return introDate;
    }

    public void setIntroDate(LocalDateTime introDate) {
        this.introDate = introDate;
    }

    public LocalDateTime getEndDate() {
        return endDate;
    }

    public void setEndDate(LocalDateTime endDate) {
        this.endDate = endDate;
    }

    public boolean isIsactive() {
        return isactive;
    }

    public void setIsactive(boolean isactive) {
        this.isactive = isactive;
    }

    public double getCostCurrent() {
        return costCurrent;
    }

    public void setCostCurrent(double costCurrent) {
        this.costCurrent = costCurrent;
    }

    public double getCostIntroTime() {
        return costIntroTime;
    }

    public void setCostIntroTime(double costIntroTime) {
        this.costIntroTime = costIntroTime;
    }

    
    
}
