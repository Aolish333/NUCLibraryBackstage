package com.nuclibrarybackstage.utlis;

import com.nuclibrarybackstage.domain.Result;

/**
 * @author aolish333@gmail.com
 * @date 2018/1/12 16:15
 * User:Lee
 */
public class ResultUtlis {
    public static Result success (Object object){
        Result result = new Result();
        result.setCode(0);
        result.setMsg("succeed");
        result.setData(object);
        return result;
    }

    public static Result success() {
        return success(null);
    }

    public static Result error(Integer code, String msg){
        Result result = new Result();
        result.setCode(code);
        result.setMsg(msg);
        return result;
    }
}
