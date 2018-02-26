/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mench.config;

import com.mench.bean.Subscription;
import com.mench.bean.SubscriptionBundle;
import com.mench.service.SubscriptionBundleService;
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
public class SubscriptionBundleController {
    
      @Autowired 
      SubscriptionBundleService subscriptionBundleService;

         @RequestMapping(value = "/subscriptionBundle/", method = RequestMethod.GET)
    public ResponseEntity<List<SubscriptionBundle>> listAllSubscriptionBundle() {
        List<SubscriptionBundle> subscriptionBundle =subscriptionBundleService.findAll();
        if(subscriptionBundle.isEmpty()){
            return new ResponseEntity<List<SubscriptionBundle>>(HttpStatus.NO_CONTENT);//You many decide to return HttpStatus.NOT_FOUND
        }
        return new ResponseEntity<List<SubscriptionBundle>>(subscriptionBundle, HttpStatus.OK);
    }
 
    
     @RequestMapping(value = "/subscriptionBundle/", method = RequestMethod.POST)
    public ResponseEntity<Void> createSubscriptionBundle(@RequestBody SubscriptionBundle subscriptionBundles,    UriComponentsBuilder ucBuilder) {
     
 
  //      if (userService.isUserExist(user)) {
   //         System.out.println("A User with name " + user.getName() + " already exist");
    //        return new ResponseEntity<Void>(HttpStatus.CONFLICT);
     //   }
 
   
   subscriptionBundleService.addSubscriptionBundle(subscriptionBundles);
 
        HttpHeaders headers = new HttpHeaders();
        headers.setLocation(ucBuilder.path("/subscriptionBundleService/{id}").buildAndExpand("").toUri());
        return new ResponseEntity<Void>(headers, HttpStatus.CREATED);
    }


      
}
