package com.nuclibrarybackstage.controller;

import com.mysql.jdbc.util.ResultSetUtil;
import com.nuclibrarybackstage.domain.Result;
import com.nuclibrarybackstage.domain.User;
import com.nuclibrarybackstage.repository.UserRepository;
import com.nuclibrarybackstage.utlis.ResultUtlis;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

/**
 * @author aolish333@gmail.com
 * @date 2018/1/11 20:23
 * UserRepository:Lee
 */
@RestController
public class UerController {

    private final static Logger logger = LoggerFactory.getLogger(UerController.class);


    @Autowired
    private UserRepository userRepository;

    /**
     * 添加一个学生用户
     *
     * @param studentID 学生学号
     * @param password  登陆密码
     * @return
     */
    @PostMapping(value = "/user")
    public Result<User> userAdd(@Valid User user , BindingResult bindingResult) {
        if (bindingResult.hasErrors()){
            System.out.println(bindingResult.getFieldError().getDefaultMessage());
            return ResultUtlis.error(1,bindingResult.getFieldError().getDefaultMessage());
        }
        user.setStudentID(user.getStudentID());
        user.setPassword(user.getPassword());
        return ResultUtlis.success(userRepository.save(user));
    }

    /**
     * 查询所有的用户信息
     *
     * @return
     */
    @GetMapping(value = "/user")
    public List <User> usersList() {
        logger.info("get userList");
        return userRepository.findAll();
    }

    /**
     * 查询一个用户
     *
     * @param id
     * @return
     */
    @GetMapping(value = "/user/{id}")
    public User userFindOne(@PathVariable("id") Integer id) {
        return userRepository.findOne(id);
    }

    /**
     * 更新用户
     *
     * @param id 用户id
     * @param studentID 学生学号
     * @param password  登陆密码
     * @return
     */
    @PutMapping(value = "/user/{id}")
    public User userUpdate(@PathVariable("id") Integer id,
                           @RequestParam("studentID") String studentID,
                           @RequestParam("password") String password) {
        System.out.println("11111111");
        User user = new User();
        user.setId(id);
        user.setStudentID(studentID);
        user.setPassword(password);
        return userRepository.save(user);
    }

    /**
     * 删除用户
     * @param id
     */
    @DeleteMapping(value = "/user/{id}")
    public void delete(@PathVariable("id") Integer id) {
        userRepository.delete(id);
    }
}
