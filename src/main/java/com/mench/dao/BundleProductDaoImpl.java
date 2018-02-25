/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mench.dao;

import com.mench.bean.Bundle;
import com.mench.bean.BundleProduct;
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
@Qualifier("bundleProductDao")
public class BundleProductDaoImpl implements BundleProductDao{

     @Autowired
    JdbcTemplate jdbcTemplate;
    
    @Override
    public void addBundleProduct(BundleProduct bundleProduct) {
        
       
         
           jdbcTemplate.update("INSERT INTO  product_bundle_master(product_id,base_price,quoted_price,isApplicable,created_date,end_date,discount_percentage,description,bundle_id) VALUES (?, ?, ?, ?,?,?,?,?,?)", bundleProduct.getProductId(),bundleProduct.getBasePrice(),bundleProduct.getQuotedPrice(),bundleProduct.isIsApplicable(),bundleProduct.getCreatedDate(),bundleProduct.getEndDate(),bundleProduct.getDiscountPercentage(),bundleProduct.getDescription(),bundleProduct.getBundleId());
       
     //   throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<BundleProduct> findAll() {
        
                List < BundleProduct > bundleProduct = jdbcTemplate.query("SELECT * FROM product_bundle_master", new BeanPropertyRowMapper(BundleProduct.class));
        return bundleProduct;
    
        
     //   throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
