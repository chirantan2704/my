/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mench.service;

import com.mench.bean.Product;
import com.mench.bean.User;
import com.mench.dao.ProductDao;
import com.mench.dao.UserDao;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author pathachi
 */
@Service("productService")
public class ProductServiceImpl implements ProductService{

    @Autowired
    ProductDao productDao;
    
    @Override
    public void addProduct(Product product) {
      productDao.addProduct(product);
    //    throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void editProduct(Product product, int productId) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

  //  @Override
   // public void deleteProduct(String productId) {
    //    throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
   // }

   // @Override
   // public Product find(String productId) {
   //     throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
   // }

    @Override
    public List<Product> findAll() {
        
        List<Product> product= productDao.findAll();
    //    throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    return product;
    }
    
}
