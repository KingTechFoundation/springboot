package com.example.spring.entity;

import jakarta.persistence.*;

import java.util.List;

@Entity
public class District {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer Id;
    private String districtName;

    @OneToMany(mappedBy = "district")
    private List<Student> student;

    public District() {
    }

    public District(Integer id, String districtName, List<Student> student) {
        Id = id;
        this.districtName = districtName;
        this.student = student;
    }

    public Integer getId() {
        return Id;
    }

    public void setId(Integer id) {
        Id = id;
    }

    public String getDistrictName() {
        return districtName;
    }

    public void setDistrictName(String districtName) {
        this.districtName = districtName;
    }

    public List<Student> getStudent() {
        return student;
    }

    public void setStudent(List<Student> student) {
        this.student = student;
    }
}
