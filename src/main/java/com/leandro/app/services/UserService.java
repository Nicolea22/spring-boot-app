package com.leandro.app.services;

import com.leandro.app.model.entities.User;

import java.util.List;
import java.util.Optional;

public interface UserService {

    void save(List<User> users);
    void deleteById(Long id);
    Optional<User> findById(Long id);
    User save(User user);
}
