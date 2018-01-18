package com.nuclibrarybackstage.domain;

/**
 * @author aolish333@gmail.com
 * @date 2018/1/15 19:22
 * User:Lee
 */

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;

/**
 * 教室的座位情况
 *
 * JPA双向多对一关系的多的一端,
 * JPA规范规定：如果是双向的一对多关系，多的一方为关系维护端。
 * 关系维护端负责外键记录的更新，关系被维护端没有权利更新外键字段
 * @author hp
 */
@Api("座位表")
@Entity
@Data
public class ClassroomSeatStitution {

    public  ClassroomSeatStitution(){

    }

    @Id
    @GeneratedValue(generator = "studyLoungeSeatID")
    @GenericGenerator(name = "studyLoungeSeatID" ,strategy = "assigned")
    @ApiModelProperty("座位号")
    @Column(nullable = false,length = 20)
    private String studyLoungeSeatID;


    @Column(length = 20)
    @ApiModelProperty("座位目前使用情况")
    private String SeatUsageState;


    @ManyToOne(cascade={CascadeType.ALL},fetch = FetchType.EAGER)
    @JoinColumn(name = "classRoomNo")
    private StudyLounge studyLounge;


}
