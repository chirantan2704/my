/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mench.dao;

import com.mench.bean.Product;
import com.mench.bean.User;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

/**
 *
 * @author pathachi
 */
@Repository
@Qualifier("productDao")
public class ProductDaoImpl implements ProductDao{

    @Autowired
    JdbcTemplate jdbcTemplate;
    
    @Override
    public void addProduct(Product product) {
  
        
         jdbcTemplate.update("INSERT INTO  Product(product_name, description, intro_date,end_date,isactive,cost_current,cost_intro_time) VALUES (?, ?, ?, ?,?,?,?)",
            product.getProduct_name(),product.getDescription(),product.getIntro_date(),product.getEnd_date(),product.isIsactive(),product.getCost_current(),product.getCost_intro_time());
       
  //      throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void editProduct(Product product, String productId) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void deleteProduct(String productId) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Product find(String productId) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<Product> findAll() {
        
            List < Product > product = jdbcTemplate.query("SELECT * FROM product", new BeanPropertyRowMapper(Product.class));
        return product;
    
      //  throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
