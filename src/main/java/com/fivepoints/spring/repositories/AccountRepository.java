package com.fivepoints.spring.repositories;

import com.fivepoints.spring.entities.Account;
import org.springframework.data.repository.CrudRepository;

public interface AccountRepository extends CrudRepository<Account, Integer> {
}
