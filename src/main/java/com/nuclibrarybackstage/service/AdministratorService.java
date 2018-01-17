package com.nuclibrarybackstage.service;

import com.nuclibrarybackstage.enums.LoginEnum;

/**
 * @author aolish333@gmail.com
 * @date 2018/1/17 11:39
 * User:Lee
 */
public interface AdministratorService {
    LoginEnum findUser(String jobNumber, String password);
}
