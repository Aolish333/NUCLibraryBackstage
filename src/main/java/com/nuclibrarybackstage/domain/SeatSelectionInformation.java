package com.nuclibrarybackstage.domain;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiModelProperty;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.sql.Timestamp;

/**
 * @author aolish333@gmail.com
 * @date 2018/1/15 19:06
 * User:Lee
 */

/**
 * 学生选座信息
 */
@Api("学生选择作为信息")
@Entity()
public class SeatSelectionInformation {


    @Id
    @ApiModelProperty("选座单号")
    private String disposeUUId;

    @ApiModelProperty("学生学号")
    private String studentID;

    @ApiModelProperty("学生选取的座位号")
    private String classroomSeatNO;

    @ApiModelProperty(value = "选择座位的时间",notes = "学生选择时间段的开始时间")
    private Timestamp seleted_time;

    @ApiModelProperty("释放座位的时间")
    private Timestamp releaseTime;

    public String getDisposeUUId() {
        return disposeUUId;
    }

    public void setDisposeUUId(String disposeUUId) {
        this.disposeUUId = disposeUUId;
    }

    public String getStudentID() {
        return studentID;
    }

    public void setStudentID(String studentID) {
        this.studentID = studentID;
    }

    public String getClassroomSeatNO() {
        return classroomSeatNO;
    }

    public void setClassroomSeatNO(String classroomSeatNO) {
        this.classroomSeatNO = classroomSeatNO;
    }

    public Timestamp getSeleted_time() {
        return seleted_time;
    }

    public void setSeleted_time(Timestamp seleted_time) {
        this.seleted_time = seleted_time;
    }

    public Timestamp getReleaseTime() {
        return releaseTime;
    }

    public void setReleaseTime(Timestamp releaseTime) {
        this.releaseTime = releaseTime;
    }

}
