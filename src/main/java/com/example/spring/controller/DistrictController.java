package com.example.spring.controller;

import com.example.spring.entity.District;
import com.example.spring.service.DistrictService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/auca")
public class DistrictController {

    private final DistrictService service;

    public DistrictController(DistrictService service) {
        this.service = service;
    }

    @GetMapping("/district")
    public List<District> getDistrict(){
        return service.getDistrict();
    }

    @PostMapping("/district")
    public District createDistrict(@RequestBody District district){
        return  service.createDistrict(district);
    }
}
