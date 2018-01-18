package com.nuclibrarybackstage.domain;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

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
@Data
public class Administrator {


    @ApiModelProperty("管理员工号")
    @Column(nullable = false,length = 12)
    @Id
    private String jobNumber;


    @Column(nullable = false)
    @Size(min=6, max=16,message = "密码必须是6-16位")
    @ApiModelProperty("管理员登陆密码")
    private String password;


    @Column(nullable = false,length = 1)
    @ApiModelProperty("管理员权限")
    private Integer jurisdiction;
}
