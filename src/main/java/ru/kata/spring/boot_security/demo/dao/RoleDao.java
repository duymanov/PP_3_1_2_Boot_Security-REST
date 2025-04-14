package ru.kata.spring.boot_security.demo.dao;

import ru.kata.spring.boot_security.demo.model.Role;

public interface RoleDao {
    Role getRoleByName(String roleName);
    void addRole(Role role);
}
