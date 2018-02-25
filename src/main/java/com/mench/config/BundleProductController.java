/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mench.config;

import com.mench.bean.Bundle;
import com.mench.bean.BundleProduct;
import com.mench.bean.Product;
import com.mench.service.BundleProductService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.util.UriComponentsBuilder;

/**
 *
 * @author pathachi
 */
@RestController
public class BundleProductController {
      @Autowired        
    BundleProductService bundleProductService;
      
      
       @RequestMapping(value = "/bundleProduct/", method = RequestMethod.GET)
    public ResponseEntity<List<BundleProduct>> listAllBundleProducts() {
        List<BundleProduct> bundleProducts = bundleProductService.findAll();
        if(bundleProducts.isEmpty()){
            return new ResponseEntity<List<BundleProduct>>(HttpStatus.NO_CONTENT);//You many decide to return HttpStatus.NOT_FOUND
        }
        return new ResponseEntity<List<BundleProduct>>(bundleProducts, HttpStatus.OK);
    }
 
    
     @RequestMapping(value = "/bundleProduct/", method = RequestMethod.POST)
    public ResponseEntity<Void> createBundleProduct(@RequestBody BundleProduct bundleProduct,    UriComponentsBuilder ucBuilder) {
     
 
  //      if (userService.isUserExist(user)) {
   //         System.out.println("A User with name " + user.getName() + " already exist");
    //        return new ResponseEntity<Void>(HttpStatus.CONFLICT);
     //   }
 
   
       bundleProductService.addBundleProduct(bundleProduct);
 
        HttpHeaders headers = new HttpHeaders();
        headers.setLocation(ucBuilder.path("/bundleProduct/{id}").buildAndExpand(bundleProduct.getBundleId()).toUri());
        return new ResponseEntity<Void>(headers, HttpStatus.CREATED);
    }
    
}
