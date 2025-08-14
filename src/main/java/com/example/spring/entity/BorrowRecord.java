package com.example.spring.entity;

import jakarta.persistence.*;

import java.util.Date;

@Entity
public class BorrowRecord {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private Date borrowDate;
    private Date returnDate;
    private String Status;
}
