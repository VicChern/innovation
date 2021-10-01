package com.vicchern.innovationapp.entity.impl;

import com.vicchern.innovationapp.entity.IActor;

import javax.persistence.*;

@Entity
@Table(name = "actor")
public class Actor implements IActor {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column(name = "first_name")
    private String firstName;

    @Column(name = "last_name")
    private String lastName;

    @Column(name = "movie_id")
    private long movieId;

}
