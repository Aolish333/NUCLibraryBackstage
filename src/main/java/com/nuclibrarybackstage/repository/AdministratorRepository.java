package com.nuclibrarybackstage.repository;

import com.nuclibrarybackstage.domain.Administrator;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Component;

/**
 * @author aolish333@gmail.com
 * @date 2018/1/15 10:09
 * User:Lee
 */
@Component
public interface AdministratorRepository extends JpaRepository<Administrator,Integer>{
}
