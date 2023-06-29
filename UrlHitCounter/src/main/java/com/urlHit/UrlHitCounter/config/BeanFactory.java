package com.urlHit.UrlHitCounter.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.HashMap;

@Configuration
public class BeanFactory {

    @Bean
    public HashMap<String , Integer> userHitCounts () {
        return new HashMap<>();
    }
}
