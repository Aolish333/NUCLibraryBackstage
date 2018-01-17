package com.nuclibrarybackstage.domain;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.hibernate.annotations.GenericGenerator;
import org.springframework.beans.factory.annotation.Value;

import javax.persistence.*;
import javax.validation.constraints.Size;
import java.util.Set;

/**
 * @author aolish333@gmail.com
 * @date 2018/1/11 20:16
 * UserRepository:Lee
 */
@ApiModel(value = "User", description = "用户信息描述")
@Entity
public class User {
    @ApiModelProperty("学号")
    @Id
    @GeneratedValue(generator = "studentID")
    @GenericGenerator(name = "studentID",strategy = "assigned")
    @Column(nullable = false)
    private String studentID;

    @ApiModelProperty("密码")
    @Column(nullable = false,length = 16)
    @Size(min=6, max=16,message = "密码必须是6-16位")
    private String password;

    @ApiModelProperty(value = "信用分",notes = "信用分，默认值为100分")
    @Value("100")
    @Column(length = 3)
    private String creditScore;

    @ApiModelProperty(value = "选座的单号",notes = "外键")
    @OneToMany(cascade = CascadeType.ALL, targetEntity = SeatSelectionInformation.class)
    @JoinColumn(name = "disposeUUId")
    private Set <SeatSelectionInformation> seatSelectionInformations;

    public Set <SeatSelectionInformation> getSeatSelectionInformations() {
        return seatSelectionInformations;
    }

    public void setSeatSelectionInformations(Set <SeatSelectionInformation> seatSelectionInformations) {
        this.seatSelectionInformations = seatSelectionInformations;
    }

    public String getStudentID() {
        return studentID;
    }

    public void setStudentID(String studentID) {
        this.studentID = studentID;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getCreditScore() {
        return creditScore;
    }

    public void setCreditScore(String creditScore) {
        this.creditScore = creditScore;
    }


}
