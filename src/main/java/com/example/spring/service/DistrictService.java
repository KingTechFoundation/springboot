package com.example.spring.service;

import com.example.spring.entity.District;
import com.example.spring.repository.DistrictRepository;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;

@Service
public class DistrictService {

    private final DistrictRepository repository;

    public DistrictService(DistrictRepository repository) {
        this.repository = repository;
    }

    public List< District> getDistrict(){
        return repository.findAll();
    }

    public District createDistrict( District district){
        return repository.save(district);
    }
}
