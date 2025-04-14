package ru.kata.spring.boot_security.demo.service;

import ru.kata.spring.boot_security.demo.model.User;

import java.util.List;

public interface UserService {
    void add(User user, String[] roles);
    void add(User user);
    List<User> listUsers();
    void deleteUserById(Integer id);
    void updateUser(Integer id, User user, String[] roles);
    void updateUser(User user);
    User getUserById(Integer id);
    User getUserByEmail(String email);
}