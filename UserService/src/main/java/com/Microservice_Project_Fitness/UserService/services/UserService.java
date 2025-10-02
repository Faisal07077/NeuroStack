package com.Microservice_Project_Fitness.UserService.services;


import com.Microservice_Project_Fitness.UserService.Models.User;
import com.Microservice_Project_Fitness.UserService.UserRepository;
import com.Microservice_Project_Fitness.UserService.dto.RegisterRequest;
import com.Microservice_Project_Fitness.UserService.dto.UserResponse;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class UserService {

    private final UserRepository repository;

    public UserResponse register(RegisterRequest reguest) {
        if (repository.existsByEmail(reguest.getEmail())) {
            throw new RuntimeException("User Already Exists");
        }

        User user = new User();
        user.setEmail(reguest.getEmail());
        user.setFirstName(reguest.getFirstName());
        user.setLastName(reguest.getLastName());
        user.setPassword(reguest.getPassword());

        User savedUser = repository.save(user);

        UserResponse userResponse = new UserResponse();
        userResponse.setId(savedUser.getId());
        userResponse.setPassword(savedUser.getPassword());
        userResponse.setEmail(savedUser.getEmail());
        userResponse.setFirstName(savedUser.getFirstName());
        userResponse.setLastName(savedUser.getLastName());
        userResponse.setCreatedAt(savedUser.getCreatedAt());
        userResponse.setUpdatedAt(savedUser.getUpdatedAt());

        return userResponse;   // ✅ fixed
    }

    public UserResponse getUserProfile(String userId) {
        User user = repository.findById(userId)
                .orElseThrow(() -> new RuntimeException("user not found"));

        UserResponse userResponse = new UserResponse();
        userResponse.setId(user.getId());
        userResponse.setPassword(user.getPassword());
        userResponse.setEmail(user.getEmail());
        userResponse.setFirstName(user.getFirstName());
        userResponse.setLastName(user.getLastName());
        userResponse.setCreatedAt(user.getCreatedAt());
        userResponse.setUpdatedAt(user.getUpdatedAt());

        return userResponse;   // ✅ fixed
    }
}

