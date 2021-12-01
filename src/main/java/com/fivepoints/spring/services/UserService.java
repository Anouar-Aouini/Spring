package com.fivepoints.spring.services;

import com.fivepoints.spring.models.User;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

@Component
public class UserService {
    private int userIdCout = 1;

    private List<User> userlist = new CopyOnWriteArrayList<>();

    public User addUser(User user){
        user.setId(userIdCout);
        userlist.add(user);
        userIdCout++;
        return user;
    }

    public List<User> getUsers(){
        return userlist;
    }

    public User getUser(int userId){
        return userlist.stream().filter(u -> u.getId() == userId)
                .findFirst()
                .get();
    }

    public User updateUser(int userId,User user){
        userlist.stream()
                .forEach(u -> {
                    if(u.getId() == userId){
                        u.setFirstName(user.getFirstName());
                        u.setLastname(user.getLastname());
                        u.setEmail(user.getEmail());
                    }
                });
        return userlist.stream()
                .filter(u -> u.getId() == userId)
                .findFirst()
                .get();
    }

    public void deleteUser(int userId){
        userlist.stream()
                .forEach(u -> {
                    if(u.getId() == userId){
                        userlist.remove(u);
                    }
                });
    }


}
