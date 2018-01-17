package com.nuclibrarybackstage.repository;

import com.nuclibrarybackstage.domain.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * @author aolish333@gmail.com
 * @date 2018/1/11 20:24
 * UserRepository:Lee
 */
@Repository
public interface UserRepository extends JpaRepository<User,String> {
}
