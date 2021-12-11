package com.fivepoints.spring.entities;


import javax.persistence.*;

import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "position")
public class Position {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int p_id;
    @Column(name= "p_name")
    private String p_name;


    @OneToMany(mappedBy="id",
            cascade = {CascadeType.PERSIST, CascadeType.REMOVE},
            fetch=FetchType.EAGER)
    private List<User> users = new ArrayList<>();

    public Position(){}



    public Position(String p_name,List<User> users) {
        this.p_name = p_name;
    }

    public int getP_id() {
        return p_id;
    }

    public void setP_id() {
        this.p_id = p_id;
    }

    public String getP_name() {
        return p_name;
    }

    public void setP_name(String p_name) {
        this.p_name = p_name;
    }

}
