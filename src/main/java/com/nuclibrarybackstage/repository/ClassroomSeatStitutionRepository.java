package com.nuclibrarybackstage.repository;

import com.nuclibrarybackstage.domain.ClassroomSeatStitution;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Component;

/**
 * @author aolish333@gmail.com
 * @date 2018/1/17 10:28
 * User:Lee
 */
@Component
public interface ClassroomSeatStitutionRepository extends JpaRepository<ClassroomSeatStitution,String> {
}
