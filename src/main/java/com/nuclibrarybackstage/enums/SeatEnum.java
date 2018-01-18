package com.nuclibrarybackstage.enums;

import lombok.Getter;

/**
 * @author aolish333@gmail.com
 * @date 2018/1/17 18:05
 * User:Lee
 */
@Getter
public enum  SeatEnum implements CodeEnum {
    SUCCEED(0,"选座成功"),
    OCCUPIED(1,"座位已经被占"),
    HADED(2,"不能再次选择其它错误"),
    ERROR(3,"系统异常");

    SeatEnum(Integer code, String msg) {
        this.code = code;
        this.msg = msg;
    }

    private Integer code;
    private String msg;
}
