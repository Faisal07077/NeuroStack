package com.Microservice_Project_Fitness.UserService.controller;


import com.Microservice_Project_Fitness.UserService.dto.RegisterRequest;
import com.Microservice_Project_Fitness.UserService.dto.UserResponse;
import com.Microservice_Project_Fitness.UserService.services.UserService;
import jakarta.validation.Valid;
import lombok.AllArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/users")
@AllArgsConstructor
public class userController {
    private UserService userService;

    @GetMapping("/{userId}")
    public  ResponseEntity<UserResponse> getUserProfile(@PathVariable String userId){
        return ResponseEntity.ok(userService.getUserProfile(userId));
    }

    @PostMapping("/register")
    public ResponseEntity<UserResponse> register(@Valid @RequestBody RegisterRequest request) {
        return ResponseEntity.ok(userService.register(request));
    }

}
