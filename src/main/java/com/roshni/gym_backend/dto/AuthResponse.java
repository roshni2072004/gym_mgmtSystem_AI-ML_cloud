package com.roshni.gym_backend.dto;

import com.roshni.gym_backend.entity.User;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class AuthResponse {

    private String token;       // JWT token → frontend stores this
    private String name;        // User's full name
    private String email;       // User's email
    private User.Role role;     // ADMIN, TRAINER or MEMBER
    private String message;     // "Login successful!" etc
}