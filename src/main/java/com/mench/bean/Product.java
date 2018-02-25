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
 
   String     product_id;			
   String     product_name;			
   String     description;			
 LocalDateTime intro_date;			
LocalDateTime end_date;			
boolean       isactive;			
double        cost_current;			
double        cost_intro_time;

    public String getProduct_id() {
        return product_id;
    }

    public void setProduct_id(String product_id) {
        this.product_id = product_id;
    }

    public String getProduct_name() {
        return product_name;
    }

    public void setProduct_name(String product_name) {
        this.product_name = product_name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public LocalDateTime getIntro_date() {
        return intro_date;
    }

    public void setIntro_date(LocalDateTime intro_date) {
        this.intro_date = intro_date;
    }

    public LocalDateTime getEnd_date() {
        return end_date;
    }

    public void setEnd_date(LocalDateTime end_date) {
        this.end_date = end_date;
    }

    public boolean isIsactive() {
        return isactive;
    }

    public void setIsactive(boolean isactive) {
        this.isactive = isactive;
    }

    public double getCost_current() {
        return cost_current;
    }

    public void setCost_current(double cost_current) {
        this.cost_current = cost_current;
    }

    public double getCost_intro_time() {
        return cost_intro_time;
    }

    public void setCost_intro_time(double cost_intro_time) {
        this.cost_intro_time = cost_intro_time;
    }
    
    
    
}
