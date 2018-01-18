package com.nuclibrarybackstage.controller;

import com.nuclibrarybackstage.domain.StudyLounge;
import com.nuclibrarybackstage.repository.StudyLoungeRepository;
import com.nuclibrarybackstage.service.StudyLoungeService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

/**
 * @author aolish333@gmail.com
 * @date 2018/1/18 10:29
 * User:Lee
 */
@Api(value = "自习室的管理")
@RestController
@RequestMapping("/NUC/StudyLounge")
public class StudyLoungeController {
    @Autowired
    private StudyLoungeRepository studyLoungeRepository;
    @Autowired
    private StudyLoungeService studyLoungeService;


    @ApiOperation(value = "创建自习室",notes = "创建图书馆自习室")
    @PostMapping(value = "/create")
    public void createStudyLounge(@Valid StudyLounge studyLounge){
        studyLoungeService.createStudyLounge(studyLounge);
    }

    @ApiOperation(value = "更新图书馆自习室")
    @PutMapping(value = "/update/{classRoomNo}")
    public void updataStudyLounge(@PathVariable("classRoomNo") String classRoomNo,
                                  @RequestParam("seatInformation") String seatInformation){
        studyLoungeService.createStudyLounge(new StudyLounge(classRoomNo,seatInformation));
    }

    /** 删除自习室 */
    @DeleteMapping(value = "/manage/{classRoomNo}")
    public void deleteStudyLounge(@PathVariable("classRoomNo") String classRoomNo){
        studyLoungeRepository.deleteStudyLoungesByClassRoomNo(classRoomNo);
    }

}
