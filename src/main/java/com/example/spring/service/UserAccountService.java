package com.example.spring.service;

import com.example.spring.entity.UserAccount;
import com.example.spring.repository.UserAccountRepository;
import org.springframework.stereotype.Service;


import java.util.Optional;

@Service
public class UserAccountService {

    private final UserAccountRepository repository;

    public UserAccountService(UserAccountRepository repository) {
        this.repository = repository;
    }


    public Optional<UserAccount> getUserAccounts(Integer  id  ){
        return repository.findById(id);
    }


    public UserAccount createUserAccounts( UserAccount userAccount){
        return repository.save(userAccount);
    }
}
