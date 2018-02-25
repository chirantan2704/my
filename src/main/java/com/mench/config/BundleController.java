/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mench.config;

import com.mench.bean.Bundle;
import com.mench.service.BundleService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
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
public class BundleController {
      @Autowired        
    BundleService bundleService;  //Service which will do all data retrieval/manipulation work
 
     
    //-------------------Retrieve All Users--------------------------------------------------------
     
    @RequestMapping(value = "/bundle/", method = RequestMethod.GET)
    public ResponseEntity<List<Bundle>> listAllBundles() {
        List<Bundle> bundles = bundleService.findAll();
        if(bundles.isEmpty()){
            return new ResponseEntity<List<Bundle>>(HttpStatus.NO_CONTENT);//You many decide to return HttpStatus.NOT_FOUND
        }
        return new ResponseEntity<List<Bundle>>(bundles, HttpStatus.OK);
    }
 
 
    //-------------------Retrieve Single User--------------------------------------------------------
     
    @RequestMapping(value = "/bundle/{id}", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<Bundle> getBundle(@PathVariable("id") int id) {
    //    System.out.println("Fetching User with id " + id);
     //   Product product = productService.find(id);
         Bundle bundle = null;
        if (bundle == null) {
            System.out.println("product with id " + id + " not found");
            return new ResponseEntity<Bundle>(HttpStatus.NOT_FOUND);
        }
        return new ResponseEntity<Bundle>(bundle, HttpStatus.OK);
    }
 
     
     
    //-------------------Create a User--------------------------------------------------------
     
    @RequestMapping(value = "/bundle/", method = RequestMethod.POST)
    public ResponseEntity<Void> createBundle(@RequestBody Bundle bundle,    UriComponentsBuilder ucBuilder) {
     
 
  //      if (userService.isUserExist(user)) {
   //         System.out.println("A User with name " + user.getName() + " already exist");
    //        return new ResponseEntity<Void>(HttpStatus.CONFLICT);
     //   }
 
   
       bundleService.addBundle(bundle);
 
        HttpHeaders headers = new HttpHeaders();
        headers.setLocation(ucBuilder.path("/bundle/{id}").buildAndExpand(bundle.getBundle_id()).toUri());
        return new ResponseEntity<Void>(headers, HttpStatus.CREATED);
    }
 
     
    //------------------- Update a User --------------------------------------------------------
     /*
    @RequestMapping(value = "/user/{id}", method = RequestMethod.PUT)
    public ResponseEntity<User> updateUser(@PathVariable("id") long id, @RequestBody User user) {
        System.out.println("Updating User " + id);
         
        User currentUser = userService.findById(id);
         
        if (currentUser==null) {
            System.out.println("User with id " + id + " not found");
            return new ResponseEntity<User>(HttpStatus.NOT_FOUND);
        }
 
        currentUser.setName(user.getName());
        currentUser.setAge(user.getAge());
        currentUser.setSalary(user.getSalary());
         
        userService.updateUser(currentUser);
        return new ResponseEntity<User>(currentUser, HttpStatus.OK);
    }
 
    //------------------- Delete a User --------------------------------------------------------
     
    @RequestMapping(value = "/user/{id}", method = RequestMethod.DELETE)
    public ResponseEntity<User> deleteUser(@PathVariable("id") long id) {
        System.out.println("Fetching & Deleting User with id " + id);
 
        User user = userService.findById(id);
        if (user == null) {
            System.out.println("Unable to delete. User with id " + id + " not found");
            return new ResponseEntity<User>(HttpStatus.NOT_FOUND);
        }
 
        userService.deleteUserById(id);
        return new ResponseEntity<User>(HttpStatus.NO_CONTENT);
    }
 
     
    //------------------- Delete All Users --------------------------------------------------------
     
    @RequestMapping(value = "/user/", method = RequestMethod.DELETE)
    public ResponseEntity<User> deleteAllUsers() {
        System.out.println("Deleting All Users");
 
        userService.deleteAllUsers();
        return new ResponseEntity<User>(HttpStatus.NO_CONTENT);
    }
 */
}
