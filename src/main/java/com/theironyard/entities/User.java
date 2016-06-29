package com.theironyard.entities;

import com.sun.tools.javac.util.List;

import javax.persistence.*;

/**
 * Created by zach on 11/11/15.
 */
@Entity
@Table(name = "users")
public class User {
    @Id
    @GeneratedValue
    Integer id;

    @Column(nullable = false)
    public String name;

    @Column(nullable = false)
    public String password;
}