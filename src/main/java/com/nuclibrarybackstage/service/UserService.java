package com.nuclibrarybackstage.service;

import com.nuclibrarybackstage.enums.LoginEnum;

/**
 * @author aolish333@gmail.com
 * @date 2018/1/12 16:23
 * User:Lee
 */

public interface UserService {

    /**
     * 登陆
     * @param studentID 学号
     * @param password 密码
     * @return code & msg & data
     */
    LoginEnum findUser(String studentID, String password);

}
