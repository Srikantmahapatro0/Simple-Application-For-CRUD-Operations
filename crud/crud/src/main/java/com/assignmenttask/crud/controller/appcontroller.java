package com.assignmenttask.crud.controller;

import com.assignmenttask.crud.models.user;
import org.springframework.web.bind.annotation.*;
import com.assignmenttask.crud.services.userservice;
@RestController
public class appcontroller {
    private userservice userservice;

    public appcontroller(userservice userservice) {
        this.userservice = userservice;
    }

    @GetMapping("/users/{id}")
    public user getuserById(@PathVariable("id") Long id) {
        return userservice.getSingleuser(id);
    }
    @PostMapping("/users")
    public user Createuser(@RequestBody user newuser) {
        return userservice.Createuser(
               newuser.getFirstname(),
               newuser.getLastname(),
               newuser.getPhonenumber(),
               newuser.getEmail(),
               newuser.getAddress());
    }
    @DeleteMapping("/user/{id}")
    public void deleteproduct(@PathVariable("id") Long id) {
               userservice.deleteProduct(id);
    }
    @PostMapping("/users")
    public void updateuser(@RequestBody user temp){
        userservice.updateuser();
    }

}
