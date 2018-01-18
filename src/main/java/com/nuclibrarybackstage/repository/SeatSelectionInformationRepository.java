package com.nuclibrarybackstage.repository;

import com.nuclibrarybackstage.domain.SeatSelectionInformation;
import com.nuclibrarybackstage.domain.StudyLounge;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @author aolish333@gmail.com
 * @date 2018/1/17 11:26
 * User:Lee
 */
public interface SeatSelectionInformationRepository extends JpaRepository<SeatSelectionInformation,String>{
    void save(StudyLounge studyLounge);
}
