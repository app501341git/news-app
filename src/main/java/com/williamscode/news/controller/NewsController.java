package com.williamscode.news.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/news")
public class NewsController {

    @GetMapping
    ResponseEntity<String> test(){
        return ResponseEntity.ok("test");
    }
}
