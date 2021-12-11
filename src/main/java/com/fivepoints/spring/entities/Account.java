package com.fivepoints.spring.entities;


import javax.persistence.*;

@Entity
@Table(name = "account")
public class Account {

    @Id
    private int id;

    private String password;

    @OneToOne
    @JoinColumn(name = "id", referencedColumnName = "id")
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

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }
}