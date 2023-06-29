package com.usermanagement.usermanagementsystem;

 import com.usermanagement.usermanagementsystem.entity.UserEntity;
 import org.springframework.context.annotation.Bean;
 import org.springframework.context.annotation.Configuration;
 import java.util.ArrayList;
 import java.util.List;

@Configuration
public class BeanFactory {

    @Bean
    public List<UserEntity> getAllUser() {
        return new ArrayList<>();
    }

}
