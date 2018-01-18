package com.nuclibrarybackstage.service;

import com.nuclibrarybackstage.enums.CommonalityEunm;
import com.nuclibrarybackstage.enums.SeatEnum;

/**
 * @author aolish333@gmail.com
 * @date 2018/1/17 18:35
 * User:Lee
 */
public interface ClassroomSeatStitutionService {
    /**
     * 选择座位
     */
    SeatEnum updataSeat(String studyLoungeSeatID);

    /**
     * 释放座位
     */
    CommonalityEunm releaseSeat(String studyLoungeSeatID, String ds);

    /** 删除座位 */
    CommonalityEunm deleteSeat(String studyLoungeSeatID);
}
