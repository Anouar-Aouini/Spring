package com.fivepoints.spring.repositories;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import com.fivepoints.spring.services.*;
import com.fivepoints.spring.models.User;
@Repository("UserRepository")
public interface UserRepository extends CrudRepository<User, Integer>
{
    List<User> findByFirstName(String firstName);
    List<User> findByLastName(String lastName);

}