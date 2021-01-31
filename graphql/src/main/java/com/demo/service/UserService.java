package com.demo.service;

import com.coxautodev.graphql.tools.GraphQLMutationResolver;
import com.coxautodev.graphql.tools.GraphQLQueryResolver;
import com.demo.entity.User;
import com.demo.repo.UserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class UserService implements GraphQLQueryResolver, GraphQLMutationResolver {

    @Autowired
    private UserRepo userRepo;

    public User getUser(Long id){
        return userRepo.findById(id).get();
    }

    public List<User> getUsers(){
        return userRepo.findAll();
    }

    @Transactional
    public User updateUser(Long id,String firstName,String lastName,String city){
        User user = userRepo.getOne(id);
        user.setFirstName(firstName);
        user.setLastName(lastName);
        user.setCity(city);
        user = userRepo.save(user);
        return user;
    }



}
