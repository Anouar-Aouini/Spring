package com.fivepoints.spring.entities;

import org.springframework.data.rest.core.annotation.RestResource;

import javax.persistence.*;

import java.io.Serializable;

@Entity
public class User implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    @Column(name= "firstName")
    private String firstName;
    @Column(name= "lastName")
    private String lastName;
    @Column(name= "email")
    private String email;
    @Column(name= "password")
    private String password;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "id")
    private Account account;

    @ManyToOne
    private Position position;

    public User(){}

    public User(String firstName, String lastName, String password, String email,Position position,Account account) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.password = password;
        this.email = email;
        this.position = position;
        this.account=account;
    }
    public int getId() {
        return id;
    }

    public void setId() {
        this.id = id;
    }
    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Position getPosition() {
        return position;
    }

    public Account getAccount() {
        return account;
    }

    public void setAccount(Account account) {
        this.account = account;
    }

    public void setPosition(Position position) {
        this.position = position;
    }
}
