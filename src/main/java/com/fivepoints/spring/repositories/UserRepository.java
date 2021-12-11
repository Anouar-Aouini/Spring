package com.fivepoints.spring.repositories;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.fivepoints.spring.entities.User;

@Repository("UserRepository")
public interface UserRepository extends CrudRepository<User, Integer>
{
//    @Query("select p.p_name from Position p join u.employe e where e.id=:employeId")
//    public float get(@Param("employeId")int employeId);

//    @Query("select c from User c where c.firstname like %?1")
//    List<User> findByNameEndsWith(String firstName);
}
