package com.fivepoints.spring.services;

import com.fivepoints.spring.entities.Position;
import com.fivepoints.spring.entities.User;
import com.fivepoints.spring.repositories.PositionRepository;
import com.fivepoints.spring.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PositionService {

    @Autowired
    PositionRepository positionRepository;

    public Position addNewPosition(Position position) {
        return this.positionRepository.save(position);
    }
    public List<Position> getPositions(){
        List<Position> positions=(List<Position>) positionRepository.findAll();
        return positions;
    }
}
