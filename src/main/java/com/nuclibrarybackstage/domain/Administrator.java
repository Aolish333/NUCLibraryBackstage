package com.nuclibrarybackstage.domain;

import io.swagger.annotations.ApiModelProperty;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.validation.constraints.Size;

/**
 * @author aolish333@gmail.com
 * @date 2018/1/15 9:46
 * User:Lee
 */
@Entity
public class Administrator {
    public Integer getJobNumber() {
        return jobNumber;
    }

    public void setJobNumber(Integer jobNumber) {
        this.jobNumber = jobNumber;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Integer getJurisdiction() {
        return jurisdiction;
    }

    public void setJurisdiction(Integer jurisdiction) {
        this.jurisdiction = jurisdiction;
    }


    @ApiModelProperty("管理员工号")
    @Column(nullable = false)
    @Id
    private Integer jobNumber;


    @Column(nullable = false)
    @Size(min=6, max=16,message = "密码必须是6-16位")
    @ApiModelProperty("管理员登陆密码")
    private String password;


    @Column(nullable = false)
    @ApiModelProperty("管理员权限")
    private Integer jurisdiction;
}
