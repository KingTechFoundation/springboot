package com.example.spring.entity;


import jakarta.persistence.*;

@Entity
public class FacultyMember {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String firstName;
    private  String lastName;
    private String email;
    private Integer phone;

}
