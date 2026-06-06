package com.roshni.gym_backend.dto;


import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import lombok.Data;

@Data
public class LoginRequest {

    // Must be a valid email format
    @NotBlank(message = "Email is required")
    @Email(message = "Enter a valid email address")
    private String email;

    // Password cannot be empty
    @NotBlank(message = "Password is required")
    private String password;
}