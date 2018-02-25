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
public class Bundle {
    
String bundle_id;			
String name;			
LocalDateTime inception_date;			
boolean active;			
Double cost;			
Integer duration;			
LocalDateTime end_date;			
String bundle_description;

    public String getBundle_id() {
        return bundle_id;
    }

    public void setBundle_id(String bundle_id) {
        this.bundle_id = bundle_id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public LocalDateTime getInception_date() {
        return inception_date;
    }

    public void setInception_date(LocalDateTime inception_date) {
        this.inception_date = inception_date;
    }

    public boolean isActive() {
        return active;
    }

    public void setActive(boolean active) {
        this.active = active;
    }

    public Double getCost() {
        return cost;
    }

    public void setCost(Double cost) {
        this.cost = cost;
    }

    public Integer getDuration() {
        return duration;
    }

    public void setDuration(Integer duration) {
        this.duration = duration;
    }

    public LocalDateTime getEnd_date() {
        return end_date;
    }

    public void setEnd_date(LocalDateTime end_date) {
        this.end_date = end_date;
    }

    public String getBundle_description() {
        return bundle_description;
    }

    public void setBundle_description(String bundle_description) {
        this.bundle_description = bundle_description;
    }
    
}
