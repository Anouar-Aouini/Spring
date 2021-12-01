package com.fivepoints.spring.api;

import com.fivepoints.spring.models.User;
import com.fivepoints.spring.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value="/users")
public class UserResource {

    @Autowired
    private UserService userService;
    public User addUser(@RequestBody User user){
        return userService.addUser(user);
    }
    @GetMapping
    public List<User> getUsers(){
        return userService.getUsers();
    }

    @GetMapping(value="/{userId}")
    public User getUser(@PathVariable("userId") int userId){
        return userService.getUser(userId);
    }

    @PutMapping(value="/{userId}")
    public User updateUser(@PathVariable("userId") int userId, @RequestBody User user){
    return userService.updateUser(userId,user);
    }

    @DeleteMapping(value="/{userId}")
    public void deleteUser(@PathVariable("userId") int userId){
         userService.deleteUser(userId);
    }

}
