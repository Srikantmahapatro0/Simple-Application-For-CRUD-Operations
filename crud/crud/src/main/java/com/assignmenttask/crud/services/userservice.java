package com.assignmenttask.crud.services;

import com.assignmenttask.crud.models.user;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;
import com.assignmenttask.crud.repo.userrepo;

import java.util.List;
@Service
public class userservice {
    private static final String String = null;
    private userrepo userrepo;

    private RestTemplate restTemplate;
    public userservice(RestTemplate restTemplate){
        this.restTemplate=restTemplate;
    }
    public user getSingleuser(Long id) {
        return userrepo.findByIdIs(id);
    }

    public user Createuser(String firstname, String lastname, Long phonenumber, String email, String address) {
        user user =new user();
        user.setFirstname(firstname);
        user.setLastname(lastname);
        user.setPhonenumber(phonenumber);
        user.setEmail(email);
        user.setAddress(address);
        return userrepo.save(user);
    }

    public void deleteProduct(Long id) {
       userrepo.deleteBy(id);
    }
    public void updateuser(){

    }
    public List<user> getalluser(){
        return userrepo.findAll();
    }

}
