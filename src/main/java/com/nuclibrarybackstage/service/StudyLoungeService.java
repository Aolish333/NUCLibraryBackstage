package com.nuclibrarybackstage.service;

import com.nuclibrarybackstage.domain.StudyLounge;
import com.nuclibrarybackstage.enums.CommonalityEunm;

/**
 * @author aolish333@gmail.com
 * @date 2018/1/17 18:31
 * User:Lee
 */
public interface StudyLoungeService {
    /** 新建教室*/
    StudyLounge createStudyLounge(StudyLounge studyLounge);

    /** 重新布置置教室 */
    CommonalityEunm reSetRoom(String classRoomNo);
}
