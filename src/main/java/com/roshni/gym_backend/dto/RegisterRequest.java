package com.roshni.gym_backend.dto;


import com.gymmanagement.entity.User;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.Data;

@Data
public class RegisterRequest {

    // Name is required — cannot be empty
    @NotBlank(message = "Name is required")
    private String name;

    // Must be a valid email format
    @NotBlank(message = "Email is required")
    @Email(message = "Enter a valid email address")
    private String email;

    // Minimum 6 characters
    @NotBlank(message = "Password is required")
    @Size(min = 6, message = "Password must be at least 6 characters")
    private String password;

    // Phone is optional
    private String phone;

    // Role must be ADMIN, TRAINER or MEMBER
    @NotNull(message = "Role is required")
    private User.Role role;
}