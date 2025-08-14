package com.example.spring.service;

import com.example.spring.entity.Department;
import com.example.spring.repository.DepartmentRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DepartmentService {

    private final DepartmentRepository  repository;

    public DepartmentService(DepartmentRepository repository) {
        this.repository = repository;
    }

    public List<Department> getDepartments(){
        return  repository.findAll();
    }

    public Department createDepartment( Department department){
        return repository.save(department);
    }
}
