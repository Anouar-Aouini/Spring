package com.fivepoints.spring.entities;

import javax.persistence.*;

@Entity
@Table(name = "account")
public class Account {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Column(name= "password")
    private String password;

    @OneToOne(mappedBy = "account")
    private User user;

    public Account(){}
    public Account(String password) {
        this.password = password;
    }

    public int getId() {
        return id;
    }

    public void setId() {
        this.id = id;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

}
