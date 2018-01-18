package com.nuclibrarybackstage.domain;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import javax.persistence.Column;
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
@Data
public class SeatSelectionInformation {


    @Id
    @ApiModelProperty("选座单号")
    @Column(nullable = false,length = 20)
    private String disposeUUId;

    @ApiModelProperty("学生学号")
    @Column(nullable = false,length = 20)
    private String studentID;

    @ApiModelProperty("学生选取的座位号")
    @Column(nullable = false,length = 16)
    private String classroomSeatNO;

    @ApiModelProperty(value = "选择座位的时间",notes = "学生选择时间段的开始时间")
    private Timestamp seleted_time;

    @ApiModelProperty("释放座位的时间")
    private Timestamp releaseTime;

}
