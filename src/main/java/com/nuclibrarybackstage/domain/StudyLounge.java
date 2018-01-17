package com.nuclibrarybackstage.domain;

/**
 * @author aolish333@gmail.com
 * @date 2018/1/15 19:21
 * User:Lee
 */

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiModelProperty;
import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

/**
 * 图示倌自习室
 * @author hp
 */
@PersistenceUnit(unitName="StudyLounge")
@Api("图书馆自习室")
@Entity
public class StudyLounge {



    public StudyLounge(){}


    public String getClassRoomNo() {
        return classRoomNo;
    }

    public void setClassRoomNo(String classRoomNo) {
        this.classRoomNo = classRoomNo;
    }

    public String getSeatInformation() {
        return seatInformation;
    }

    public void setSeatInformation(String seatInformation) {
        this.seatInformation = seatInformation;
    }

    public Set <ClassroomSeatStitution> getSeatStitutions() {
        return seatStitutions;
    }

    public void setSeatStitutions(Set <ClassroomSeatStitution> seatStitutions) {
        this.seatStitutions = seatStitutions;
    }

    public String getNumberOfPoeple() {
        return numberOfPoeple;
    }

    public void setNumberOfPoeple(String numberOfPoeple) {
        this.numberOfPoeple = numberOfPoeple;
    }

    public StudyLounge(String seatInformation, String numberOfPoeple) {
        this.seatInformation = seatInformation;
        this.numberOfPoeple = numberOfPoeple;
    }


    @Id
    @GeneratedValue(generator = "classRoomNO")
    @GenericGenerator(name = "classRoomNO",strategy = "assigned")
    @Column(length = 11)
    @ApiModelProperty("自习教室号")
    private String classRoomNo;


    @ApiModelProperty(value = "教室座位信息",notes = "存储信息为：[eeee,____e,....]。便于存储新建教室的信息。")
    private String seatInformation;


    @ApiModelProperty(value = "教室所容纳的人数",notes = "最大值为9999")
    private String numberOfPoeple;


    @OneToMany(cascade = CascadeType.ALL, targetEntity = ClassroomSeatStitution.class)
    // 由于选座位不能重复，所以要用Set 集合
    private Set <ClassroomSeatStitution> seatStitutions = new HashSet<>();

}
