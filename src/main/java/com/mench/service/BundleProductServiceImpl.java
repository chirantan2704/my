/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mench.service;

import com.mench.bean.BundleProduct;
import com.mench.dao.BundleDao;
import com.mench.dao.BundleProductDao;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author pathachi
 */
@Service("bundleProductService")
public class BundleProductServiceImpl implements  BundleProductService
{

     @Autowired
    BundleProductDao bundleProductDao;
    @Override
    public void addBundleProduct(BundleProduct bundleProduct) {
  
        bundleProductDao.addBundleProduct(bundleProduct);
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<BundleProduct> findAll() {
      
        return bundleProductDao.findAll();
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
