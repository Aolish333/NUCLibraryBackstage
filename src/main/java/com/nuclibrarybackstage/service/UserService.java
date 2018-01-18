package com.nuclibrarybackstage.service;

import com.nuclibrarybackstage.domain.User;
import com.nuclibrarybackstage.enums.LoginEnum;
import com.nuclibrarybackstage.enums.CommonalityEunm;

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

    /** 添加用户 */
    User addUser(String studentID, String password , String creditScore);

    /** 删除用户 */
    CommonalityEunm deleteUser(String studentID);

    /** 更新用户信息 */
    CommonalityEunm updateUser(String studentID,String password, String creditScore);

}
