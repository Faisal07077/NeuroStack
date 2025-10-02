package com.Microservice_Project_Fitness.UserService.dto;


import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;
import lombok.Data;

@Data
public class RegisterRequest {
    @NotBlank(message = "Email is Required")
    @Email(message = "invalid email format")
    private String email;

    @NotBlank(message = "Password is required")
    @Size(min = 6, message = "Password must contains atleast 6 characters ")
    private String password;
    private String firstName;
    private String lastName;
}
