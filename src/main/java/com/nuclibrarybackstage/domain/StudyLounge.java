package com.nuclibrarybackstage.domain;

/**
 * @author aolish333@gmail.com
 * @date 2018/1/15 19:21
 * User:Lee
 */

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;
import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;

/**
 * 图示倌自习室
 * @author hp
 */
@Api("图书馆自习室")
@Entity
@Data
public class StudyLounge implements Serializable{

    @ApiModelProperty("自习教室号")
    @Id
    @GeneratedValue(generator = "classRoomNO")
    @GenericGenerator(name = "classRoomNO",strategy = "assigned")
    @Column(length = 11)
    private String classRoomNo;


    @ApiModelProperty(value = "教室座位信息",notes = "存储信息为：[eeee,____e,....]。便于存储新建教室的信息。")
    @Column(length = 20000)
    private String seatInformation;


    @ApiModelProperty(value = "教室所容纳的人数",notes = "最大值为9999")
    @Column(length = 4)
    private String numberOfPoeple;


    @OneToMany(cascade = CascadeType.ALL, targetEntity = ClassroomSeatStitution.class)
    // 由于选座位不能重复，所以要用Set 集合
    private Set<ClassroomSeatStitution> seatStitutions = new HashSet<>();

    public StudyLounge(){}

    public StudyLounge(String classRoomNo,String seatInformation, String numberOfPoeple) {
        this.classRoomNo = classRoomNo;
        this.seatInformation = seatInformation;
        this.numberOfPoeple = numberOfPoeple;
    }

    public StudyLounge(String classRoomNo, String seatInformation) {
        this.classRoomNo = classRoomNo;
        this.seatInformation = seatInformation;
    }
}
