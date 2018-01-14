package com.nuclibrarybackstage.enums;

/**
 * @author aolish333@gmail.com
 * @date 2018/1/12 17:16
 * User:Lee
 */
public enum ResultEnums {
    UNKONW_ERROR(-1, "未知错误"),
    SUCCESS(0, "成功"),
    PRIMARY_SCHOOL(100, "/////100 错误码////"),
    MIDDLE_SCHOOL(101, "//////101 错误码//////");

    ResultEnums(Integer code, String msg) {
        this.code = code;
        this.msg = msg;
    }

    public Integer getCode() {
        return code;
    }

    public String getMsg() {
        return msg;
    }

    private Integer code;
    private String msg;

}
