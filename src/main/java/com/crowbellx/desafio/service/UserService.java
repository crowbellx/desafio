package com.crowbellx.desafio.service;

import com.crowbellx.desafio.model.User;
import com.crowbellx.desafio.repository.UserRepository;
import org.springframework.stereotype.Service;

@Service
public class UserService {
    private final UserRepository userRepository;

    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public User findById(Long id) {
        return userRepository.findById(id).get();
    }

    public User create(User userToCreate){
        if(userRepository.existsByAccountNumber(userToCreate.account().number()))
            throw new IllegalArgumentException("This account number already exists");
        return  userRepository.save(userToCreate);
    }
}
