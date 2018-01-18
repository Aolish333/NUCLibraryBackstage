package com.nuclibrarybackstage.enums;

import lombok.Getter;

/**
 * @author aolish333@gmail.com
 * @date 2018/1/18 9:28
 * User:Lee
 */
@Getter
public enum CommonalityEunm implements CodeEnum {
    SUCCESS(0,"成功"),
    FAILURE(-1,"失败");

    CommonalityEunm(Integer code, String msg) {
        this.code = code;
        this.msg = msg;
    }

    private Integer code;

    private String msg;

}
