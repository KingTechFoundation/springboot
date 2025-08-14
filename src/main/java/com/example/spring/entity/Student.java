package com.example.spring.entity;

import jakarta.persistence.*;

import java.util.Date;
import java.util.List;

@Entity
public class Student {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String firstName;
    private String lastName;
    private String email;
    private Integer phone;
    private Date dob;
    private String address;

    @ManyToOne
    @JoinColumn(name = "department_id")
    private Department department;

    @OneToOne
    @JoinColumn(name = "userAccount_id")
    private UserAccount userAccount;

    @ManyToOne
    @JoinColumn(name ="district_id")
    private District district;
}
