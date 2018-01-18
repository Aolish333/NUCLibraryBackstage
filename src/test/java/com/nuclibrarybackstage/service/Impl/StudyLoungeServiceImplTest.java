package com.nuclibrarybackstage.service.Impl;

import com.nuclibrarybackstage.domain.StudyLounge;
import com.nuclibrarybackstage.repository.ClassroomSeatStitutionRepository;
import com.nuclibrarybackstage.repository.SeatSelectionInformationRepository;
import com.nuclibrarybackstage.service.StudyLoungeService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * @author aolish333@gmail.com
 * @date 2018/1/18 10:46
 * User:Lee
 */

@RunWith(SpringRunner.class)
@SpringBootTest
public class StudyLoungeServiceImplTest {

    @Autowired
    StudyLoungeService studyLoungeService;

    @Autowired
    ClassroomSeatStitutionRepository classroomSeatStitutionRepository;

    @Autowired
    SeatSelectionInformationRepository seatSelectionInformationRepository;

    @Test
    public void createStudyLounge() throws Exception {
        StudyLounge studyLounge = new StudyLounge("H11014","                '_e_eeee_ee',\n" +
                "                '__________',\n" +
                "                'ee_eeee_ee',\n" +
                "                'ee_eeee_ee',\n" +
                "                '__________',\n" +
                "                'ee_eeee_ee',\n" +
                "                'ee_eeee_ee',\n" +
                "                '__________',\n" +
                "                'ee_eeee_ee',\n" +
                "                'ee_eeee_ee',","59");
//        seatSelectionInformationRepository.save(studyLounge);
//        studyLoungeService.save(studyLounge);
        studyLoungeService.createStudyLounge(studyLounge);
    }

}