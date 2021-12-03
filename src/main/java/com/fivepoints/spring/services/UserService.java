package com.fivepoints.spring.services;

import com.fivepoints.spring.models.User;
import com.fivepoints.spring.payload.responses.MessageResponse;
import com.fivepoints.spring.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class UserService extends SpringBootServletInitializer {
    @Autowired
    UserRepository userRepository;

    public List<User> getUsers(){
        List<User> users=(List<User>) userRepository.findAll();
        return users;
    }

    public User getUserById(int id) { return this.userRepository.findById(id).orElse(null); }
    public User addNewUser(User user) { return this.userRepository.save(user);}
    public MessageResponse updateUserById(int id , User user){
        User userFound = this.userRepository.findById(id).orElse(null);
        if(userFound != null){
            userFound.setFirstName(user.getFirstName());
            userFound.setLastname(user.getLastname());
            userFound.setEmail(user.getEmail());
            userFound.setPassword(user.getPassword());
            this.userRepository.save(userFound);
        }
        return new MessageResponse("User updated successfully");
    }

    public MessageResponse deleteUserById(int id){
        this.userRepository.deleteById(id);
        return new MessageResponse("User deleted successfully");
    }
}
