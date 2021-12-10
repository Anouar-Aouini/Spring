package com.fivepoints.spring.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.fivepoints.spring.entities.User;

@Repository("UserRepository")
public interface UserRepository extends CrudRepository<User, Integer>
{
//    @Query("select c from User c where c.firstname like %?1")
//    List<User> findByNameEndsWith(String firstName);
}
