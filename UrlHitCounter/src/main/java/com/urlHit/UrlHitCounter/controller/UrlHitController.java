package com.urlHit.UrlHitCounter.controller;

import com.urlHit.UrlHitCounter.service.UrlHitService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RestController
@RequestMapping("/api/v1/visitor-count-app")
public class UrlHitController {
    private final UrlHitService urlHitService;

    public UrlHitController(UrlHitService urlHitService) {
        this.urlHitService = urlHitService;
    }


    @GetMapping("count")
    public String getHitCount() {
        return "Total Url hit count is " + urlHitService.incrementHitCount();
    }

    @GetMapping("username/{username}/count")
    public String getUserHitCount(@PathVariable String username) {
        Integer temp = urlHitService.getUserHitCounter(username);

        String s = username+" " + "HitCount"+":"+ temp;
        return "{Username"+":"+s+"}" ;
    }

    @GetMapping("allUsers")
    public Map<String, Integer> getAllUsers()
    {
        return urlHitService.getAllUsers();
    }
}
