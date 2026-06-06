package com.roshni.gym_backend.repository;

import com.gymmanagement.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {

    // Used during LOGIN
    // Spring auto generates → SELECT * FROM users WHERE email = ?
    Optional<User> findByEmail(String email);

    // Used during REGISTER to check duplicate email
    // Spring auto generates → SELECT COUNT(*) FROM users WHERE email = ?
    boolean existsByEmail(String email);
}