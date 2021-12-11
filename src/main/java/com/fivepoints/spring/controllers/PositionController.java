package com.fivepoints.spring.controllers;


import com.fivepoints.spring.entities.Position;
import com.fivepoints.spring.entities.User;
import com.fivepoints.spring.services.PositionService;
import com.fivepoints.spring.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import javax.persistence.Table;
import java.util.List;

@RestController
@Table(name = "position")
public class PositionController {

    @Autowired
    private PositionService positionService;
    @GetMapping(path = "/positions")
    public List<Position> getAllPositions(){
        return this.positionService.getPositions();
    }

    @PostMapping(path = "/positions")
    public Position postPosition(@RequestBody Position position){
        position.setP_id();
        return this.positionService.addNewPosition(position);
    }
}
