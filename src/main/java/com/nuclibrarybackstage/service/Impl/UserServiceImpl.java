package com.nuclibrarybackstage.service.Impl;

import com.nuclibrarybackstage.domain.User;
import com.nuclibrarybackstage.enums.CommonalityEunm;
import com.nuclibrarybackstage.enums.LoginEnum;
import com.nuclibrarybackstage.repository.UserRepository;
import com.nuclibrarybackstage.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * @author aolish333@gmail.com
 * @date 2018/1/17 15:09
 * User:Lee
 */
@Service
public class UserServiceImpl implements UserService {


    @Autowired
    UserRepository userRepository;
    @Override
    public LoginEnum findUser(String studentID, String password) {
        return null;
    }

    /**
     * 添加用户
     *
     * 判断数据库中是否已经有个改ID
     * 如果有的话返回次用户已经存在。
     * 若没有成功添加改用户
     */
    @Transactional
    @Override
    public User addUser(String studentID, String password, String creditScore) {
        User user = new User(studentID,password,creditScore);
        return userRepository.save(user);
    }

    @Override
    public CommonalityEunm deleteUser(String studentID) {
        return null;
    }

    @Override
    public CommonalityEunm updateUser(String studentID, String password, String creditScore) {
        return null;
    }


}
