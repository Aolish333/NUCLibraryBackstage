package com.nuclibrarybackstage.handle;

import com.nuclibrarybackstage.domain.Result;
import com.nuclibrarybackstage.excepation.UserException;
import com.nuclibrarybackstage.utlis.ResultUtli;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @author aolish333@gmail.com
 * @date 2018/1/12 16:26
 * User:Lee
 */
@ControllerAdvice
public class ExceptionHandle {

    private final static Logger logger = LoggerFactory.getLogger(ExceptionHandle.class);

    @ExceptionHandler()
    @ResponseBody
    public Result handle(Exception e){
        if (e instanceof UserException){
            UserException userException = (UserException)e;
            return ResultUtli.error(userException.getCode(),userException.getMessage());
        }
        else{
            logger.error("【系统异常】 {}",e);
            return ResultUtli.error(-1, "未知错误");
        }
    }
}
