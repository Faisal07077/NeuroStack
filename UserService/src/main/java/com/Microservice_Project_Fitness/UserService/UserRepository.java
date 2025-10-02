package com.Microservice_Project_Fitness.UserService;

import com.Microservice_Project_Fitness.UserService.Models.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository  extends JpaRepository<User,String>{
    Boolean existsByEmail(String email);
}
