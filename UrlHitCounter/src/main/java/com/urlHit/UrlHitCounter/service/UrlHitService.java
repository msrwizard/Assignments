package com.urlHit.UrlHitCounter.service;

import com.urlHit.UrlHitCounter.repository.UrlHitRepository;
import org.springframework.stereotype.Service;

import java.util.Map;

@Service
public class UrlHitService {

    private final UrlHitRepository urlHitRepository;

    public UrlHitService(UrlHitRepository urlHitRepository) {
        this.urlHitRepository = urlHitRepository;
    }

    public int incrementHitCount() {
        return urlHitRepository.incrementHitCount();
    }

    public void incrementUserHitCount(String username) {
        urlHitRepository.incrementUserHitCount(username);
    }

    public Integer getUserHitCounter(String username) {
        return urlHitRepository.getUserHitCounter(username);

    }

    public Map<String, Integer> getAllUsers() {
        return urlHitRepository.getAllUsers();
    }
}
