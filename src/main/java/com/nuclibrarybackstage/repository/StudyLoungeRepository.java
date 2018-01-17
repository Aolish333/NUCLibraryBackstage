package com.nuclibrarybackstage.repository;

import com.nuclibrarybackstage.domain.StudyLounge;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Component;

/**
 * @author aolish333@gmail.com
 * @date 2018/1/17 10:30
 * User:Lee
 */
@Component
public interface StudyLoungeRepository extends JpaRepository<StudyLounge,String> {
}
