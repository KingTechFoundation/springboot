package com.example.spring.controller;

import com.example.spring.entity.Department;
import com.example.spring.service.DepartmentService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/auca")
public class DepartmentController {

    private final DepartmentService service;

    public DepartmentController(DepartmentService service) {
        this.service = service;
    }

    @GetMapping("/department")
    public List<Department> getDepartments(){
        return service.getDepartments();
    }

    @PostMapping("/department")
    public Department createDepartment(@RequestBody Department department){
        return  service.createDepartment(department);
    }
}
