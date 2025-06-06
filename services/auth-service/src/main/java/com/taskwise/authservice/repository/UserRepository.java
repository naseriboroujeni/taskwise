package com.taskwise.authservice.repository;

import com.taskwise.authservice.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
    User findByEmail(String username);
    boolean existsByEmail(String username);
}
