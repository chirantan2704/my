/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mench.service;

import com.mench.bean.Product;
import com.mench.bean.User;
import java.util.List;

/**
 *
 * @author pathachi
 */
public interface ProductService {
    
    public void addProduct(Product user);
 
    public void editProduct(Product product, int productId);
 
  //  public void deleteProduct(int productId);
 
   // public Product find(int productId);
 
    public List < Product > findAll();
    
}
