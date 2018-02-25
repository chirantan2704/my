/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mench.config;

import com.mench.bean.BundleProduct;
import com.mench.bean.Subscription;
import com.mench.service.BundleProductService;
import com.mench.service.SubscriptionService;
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
public class SubscriptionController {
    
      @Autowired        
    SubscriptionService subscriptionService;
      
      
       @RequestMapping(value = "/subscription/", method = RequestMethod.GET)
    public ResponseEntity<List<Subscription>> listAllSubscriptions() {
        List<Subscription> subscription =subscriptionService.findAll();
        if(subscription.isEmpty()){
            return new ResponseEntity<List<Subscription>>(HttpStatus.NO_CONTENT);//You many decide to return HttpStatus.NOT_FOUND
        }
        return new ResponseEntity<List<Subscription>>(subscription, HttpStatus.OK);
    }
 
    
     @RequestMapping(value = "/Subscription/", method = RequestMethod.POST)
    public ResponseEntity<Void> createSubscription(@RequestBody Subscription subscription,    UriComponentsBuilder ucBuilder) {
     
 
  //      if (userService.isUserExist(user)) {
   //         System.out.println("A User with name " + user.getName() + " already exist");
    //        return new ResponseEntity<Void>(HttpStatus.CONFLICT);
     //   }
 
   
       subscriptionService.addSubscription(subscription);
 
        HttpHeaders headers = new HttpHeaders();
        headers.setLocation(ucBuilder.path("/subscriptionService/{id}").buildAndExpand("").toUri());
        return new ResponseEntity<Void>(headers, HttpStatus.CREATED);
    }
}
