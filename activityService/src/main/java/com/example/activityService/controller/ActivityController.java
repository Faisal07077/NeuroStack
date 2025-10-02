package com.example.activityService.controller;


import com.example.activityService.service.ActivityService;
import lombok.AllArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/activates")
@AllArgsConstructor
public class ActivityController {
    private ActivityService activityService;
    @PostMapping
    public ResponseEntity<ActivityRespone> tractAcvitity(RequestBody ActivityRequest request){
        return ResponseEntity.ok(activityService.trackActivity(request));
    }
}
