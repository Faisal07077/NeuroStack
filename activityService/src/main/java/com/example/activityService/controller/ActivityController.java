package com.example.activityService.controller;


import com.example.activityService.dto.ActivityRequest;
import com.example.activityService.dto.ActivityResponse;
import com.example.activityService.service.ActivityService;
import lombok.AllArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/activities")
@AllArgsConstructor
public class ActivityController {
    private ActivityService activityService;
    @PostMapping
    public ResponseEntity <ActivityResponse> trackActivity(@RequestBody ActivityRequest request){
        return ResponseEntity.ok(activityService.trackActivity(request));
    }
}
