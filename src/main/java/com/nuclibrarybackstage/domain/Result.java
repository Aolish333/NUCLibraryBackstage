package com.nuclibrarybackstage.domain;

import lombok.Data;

/**
 * @author aolish333@gmail.com
 * @date 2018/1/12 16:11
 * User:Lee
 */
@Data
public class Result<T> {

    /** 错误码. */
    private Integer code;

    /** 提示信息. */
    private String msg;

    /** 具体的内容. */
    private T data;
}
