package com.example.spring.controller;

import com.example.spring.entity.UserAccount;
import com.example.spring.service.UserAccountService;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping("/auca")
public class UserAccountController {

    private final UserAccountService service;

    public UserAccountController(UserAccountService service) {
        this.service = service;
    }

    @GetMapping("/user/{id}")
    public Optional<UserAccount> getUserAccounts(@PathVariable Integer id){
        return service.getUserAccounts(id);
    }

    @PostMapping("/user")
    public UserAccount createUserAccounts(@RequestBody UserAccount userAccount){
        return service.createUserAccounts(userAccount);
    }
}
