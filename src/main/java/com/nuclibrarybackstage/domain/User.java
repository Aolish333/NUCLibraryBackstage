package com.nuclibrarybackstage.domain;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.hibernate.annotations.GenericGenerator;
import org.springframework.beans.factory.annotation.Value;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.validation.constraints.Size;

/**
 * @author aolish333@gmail.com
 * @date 2018/1/11 20:16
 * UserRepository:Lee
 */
@ApiModel(value = "User", description = "用户信息描述")
@Entity
public class User {


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

    @ApiModelProperty("学号")
    @Id
    @GeneratedValue(generator = "studentID")
    @GenericGenerator(name = "studentID",strategy = "assigned")
    @Column(nullable = false)
    private String studentID;

    @ApiModelProperty("密码")
    @Column(nullable = false)
    @Size(min=6, max=16,message = "密码必须是6-16位")
    private String password;

    @ApiModelProperty(value = "信用分",notes = "信用分，默认值为100分")
    @Value("100")
    private String creditScore;
}
