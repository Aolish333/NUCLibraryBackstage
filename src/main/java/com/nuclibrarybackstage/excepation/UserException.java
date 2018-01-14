package com.nuclibrarybackstage.excepation;

/**
 * @author aolish333@gmail.com
 * @date 2018/1/12 16:53
 * User:Lee
 */
public class UserException extends RuntimeException{

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    private Integer code;

    public UserException(Integer code,String message){
        super(message);
        this.code = code;
    }


}
