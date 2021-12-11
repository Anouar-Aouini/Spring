package com.fivepoints.spring.repositories;

import com.fivepoints.spring.entities.Position;
import org.springframework.data.repository.CrudRepository;

public interface PositionRepository extends CrudRepository<Position, Integer> {
}
