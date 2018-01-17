package com.nuclibrarybackstage.repository;

import com.nuclibrarybackstage.domain.SeatSelectionInformation;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Component;

/**
 * @author aolish333@gmail.com
 * @date 2018/1/17 11:26
 * User:Lee
 */
@Component
public interface SeatSelectionInformationRepository extends JpaRepository<SeatSelectionInformation,String>{
}
