/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mench.dao;

import com.mench.bean.BundleProduct;
import java.util.List;

/**
 *
 * @author pathachi
 */
public interface BundleProductDao {
      public void addBundleProduct(BundleProduct bundleProduct);
 
  //  public void editBundleProduct(Bundle bundle, String bundleId);
 
  //  public void deleteBundle(String bundleId);
 
//    public BundleProduct find(String bundleId);
 
    public List < BundleProduct > findAll();
}
