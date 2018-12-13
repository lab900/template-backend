package com.lab900.api.repositories;

import com.lab900.api.model.User;
import org.springframework.stereotype.Repository;

@Repository
public class UserRepository {
    public User get(Long id) {
        return new User(1L,"Johnny","Doe");
    }
}
