package com.nuclibrarybackstage.enums;

/**
 * @author aolish333@gmail.com
 * @date 2018/1/17 14:49
 * User:Lee
 */
@lombok.Getter
public enum LoginEnum implements CodeEnum {
    SUCCEED(0,"登陆成功"),
    CHOKE(1,"密码或验证码不正确");
    LoginEnum(Integer code, String msg) {
        this.code = code;
        this.msg = msg;
    }

    private Integer code;

    private String msg;
}
