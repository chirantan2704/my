/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mench.dao;

import com.mench.bean.Bundle;
import com.mench.bean.Product;
import com.mench.bean.User;
import java.util.List;

/**
 *
 * @author pathachi
 */
public interface BundleDao {
    public void addBundle(Bundle bundle);
 
    public void editBundle(Bundle bundle, String bundleId);
 
    public void deleteBundle(String bundleId);
 
    public User find(String bundleId);
 
    public List < Bundle > findAll();
}
