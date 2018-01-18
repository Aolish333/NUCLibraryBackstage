package com.nuclibrarybackstage.enums;

/**
 * @author aolish333@gmail.com
 * @date 2018/1/17 18:16
 * User:Lee
 */
public enum StudyLoungeEnum implements CodeEnum {
    ;

    @Override
    public Integer getCode() {
        return null;
    }

    StudyLoungeEnum(Integer code, String msg) {
        this.code = code;
        this.msg = msg;
    }

    private Integer code;
    private String msg;
}
