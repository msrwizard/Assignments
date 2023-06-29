package com.urlHit.UrlHitCounter.repository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.HashMap;
import java.util.Map;

@Repository
public class UrlHitRepository {
    public Integer hitCount=0;

    @Autowired
    HashMap<String , Integer> userHitCounts;

    public int incrementHitCount() {
        return hitCount;
    }

    public void incrementUserHitCount(String username) {
        int userHitCount = userHitCounts.getOrDefault(username, 0);
        userHitCount++;
        userHitCounts.put(username, userHitCount);
        hitCount++;
    }

    public Integer getUserHitCounter(String username) {
        incrementUserHitCount(username);
        return userHitCounts.get(username);

    }

    public Map<String, Integer> getAllUsers() {
        return userHitCounts;
    }
}
