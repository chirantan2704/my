/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mench.dao;

import com.mench.bean.Product;
import com.mench.bean.User;
import java.util.List;

/**
 *
 * @author pathachi
 */
public interface ProductDao {
    
    public void addProduct(Product product);
 
    public void editProduct(Product product, String productId);
 
    public void deleteProduct(String productId);
 
    public Product find(String productId);
 
    public List < Product > findAll();
}
