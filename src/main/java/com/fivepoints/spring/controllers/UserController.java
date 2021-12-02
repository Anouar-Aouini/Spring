package com.fivepoints.spring.controllers;
import com.fivepoints.spring.models.User;
import com.fivepoints.spring.payload.responses.MessageResponse;
import com.fivepoints.spring.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class UserController {
/*
    @Autowired
    private UserService userService;

    @GetMapping(path = "/users")
    public List<User> getAllUsers(){
        return this.userService.getUsers();
    }

    @GetMapping(value="/users/{userId}")
    public User getUser(@PathVariable("userId") int userId){
        return this.userService.getUserById(userId);
    }

    @PostMapping(path = "/users")
    public User postUser(User user){return this.userService.addNewUser(user);}

    @PutMapping(value="/users/{userId}")
    public MessageResponse updateUser(@PathVariable("userId") int userId, @RequestBody User user){
    return this.userService.updateUserById(userId,user);
    }

    @DeleteMapping(value="/users/{userId}")
    public MessageResponse deleteUser(@PathVariable("userId") int userId){
         return this.userService.deleteUserById(userId);
    }
*/
}
