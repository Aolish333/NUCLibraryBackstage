package com.nuclibrarybackstage.repository;

import com.nuclibrarybackstage.domain.User;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @author aolish333@gmail.com
 * @date 2018/1/11 20:24
 * UserRepository:Lee
 */

public interface UserRepository extends JpaRepository<User,String> {
}
