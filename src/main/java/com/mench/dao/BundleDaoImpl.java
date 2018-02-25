/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mench.dao;

import com.mench.bean.Bundle;
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
@Qualifier("bundleDao")
public class BundleDaoImpl implements BundleDao{

    @Autowired
    JdbcTemplate jdbcTemplate;
    
    @Override
    public void addBundle(Bundle bundle) {
        
        
        
           jdbcTemplate.update("INSERT INTO  bundle(name,inception_date,active,cost,duration,end_date,bundle_description) VALUES (?, ?, ?, ?,?,?,?)",
            bundle.getName(),bundle.getInception_date(),bundle.isActive(),bundle.getCost(),bundle.getDuration(),bundle.getEnd_date(),bundle.getBundle_description());
       
        
     //   throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void editBundle(Bundle bundle, String bundleId) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void deleteBundle(String bundleId) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public User find(String bundleId) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<Bundle> findAll() {
        
             List < Bundle > bundle = jdbcTemplate.query("SELECT * FROM bundle", new BeanPropertyRowMapper(Bundle.class));
        return bundle;
    
      //  throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
