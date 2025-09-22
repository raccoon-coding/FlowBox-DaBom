package com.dabom.common;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/health")
public class HealthController {

    @GetMapping("/health")
    public ResponseEntity health(){ return ResponseEntity.ok().build(); }

    @GetMapping("/test")
    public ResponseEntity test() {
        try {
            return ResponseEntity.ok("Test OK");
        } catch (Exception e) {
            return ResponseEntity.status(500).build();
        }
    }
}