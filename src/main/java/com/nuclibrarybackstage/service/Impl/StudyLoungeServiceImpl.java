package com.nuclibrarybackstage.service.Impl;

import com.nuclibrarybackstage.domain.ClassroomSeatStitution;
import com.nuclibrarybackstage.domain.StudyLounge;
import com.nuclibrarybackstage.enums.CommonalityEunm;
import com.nuclibrarybackstage.repository.ClassroomSeatStitutionRepository;
import com.nuclibrarybackstage.repository.SeatSelectionInformationRepository;
import com.nuclibrarybackstage.repository.StudyLoungeRepository;
import com.nuclibrarybackstage.service.StudyLoungeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * @author aolish333@gmail.com
 * @date 2018/1/18 10:33
 * User:Lee
 */
@Service
public class StudyLoungeServiceImpl implements StudyLoungeService {

    @Autowired
    StudyLoungeRepository studyLoungeRepository;

    @Autowired
    ClassroomSeatStitutionRepository classroomSeatStitutionRepository;

    @Autowired
    SeatSelectionInformationRepository seatSelectionInformationRepository;

    @Transactional
    @Override
    public StudyLounge createStudyLounge(StudyLounge studyLounge) {
        /** 教室样式中的空格，减少存储量*/
        studyLounge.setSeatInformation(studyLounge.getSeatInformation().trim());
        /** 获取新建教室的信息 */
        String test = studyLounge.getSeatInformation();
        Pattern pattern = Pattern.compile("[a-z|A-Z]");
        Matcher matcher = pattern.matcher(test);
        int seatNumber = 0;
        while (matcher.find()) {
            seatNumber++;
        }
        int seat = seatNumber;
        System.out.println("matche Count is "+seatNumber);
        /** 设置教室的人数 */
        studyLounge.setNumberOfPoeple(String.valueOf(seatNumber));
        /** 初始化教室的座位信息 */
        List <ClassroomSeatStitution> allSeat = new ArrayList <>();
        for (;seatNumber > 0;seatNumber--){
            ClassroomSeatStitution classroomSeatStitution = new ClassroomSeatStitution();
            /** 设置教室座位编号 */
            System.out.println(seat);
            classroomSeatStitution.setStudyLoungeSeatID(String.valueOf(seat));
            classroomSeatStitution.setStudyLounge(studyLounge);
            allSeat.add(classroomSeatStitution);
        }
        classroomSeatStitutionRepository.save(allSeat);
        // 返回新建教室后的样子及座位信息
        return null;
    }

    @Transactional
    @Override
    public CommonalityEunm reSetRoom(String classRoomNo) {
        return null;
    }


}
