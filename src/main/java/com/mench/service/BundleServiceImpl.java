/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mench.service;

import com.mench.bean.Bundle;
import com.mench.bean.Product;
import com.mench.bean.User;
import com.mench.dao.BundleDao;
import com.mench.dao.ProductDao;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author pathachi
 */
@Service("bundleService")
public class BundleServiceImpl implements BundleService {

    @Autowired
    BundleDao bundleDao;
    
    @Override
    public void addBundle(Bundle bundle) {
        bundleDao.addBundle(bundle);
  //      throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
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
    //       List<Bundle> bundle= bundleDao.findAll();
    //    throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
      return bundle;
    }
    
}
