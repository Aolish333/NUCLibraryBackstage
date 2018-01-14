package com.nuclibrarybackstage.repository;

import com.nuclibrarybackstage.domain.User;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Component;

/**
 * @author aolish333@gmail.com
 * @date 2018/1/11 20:24
 * UserRepository:Lee
 */
@Component
@ConfigurationProperties(prefix = "user")
public interface UserRepository extends JpaRepository<User,Integer>{
}
