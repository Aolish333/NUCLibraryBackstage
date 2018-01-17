package com.nuclibrarybackstage.controller;

import com.nuclibrarybackstage.domain.Result;
import com.nuclibrarybackstage.domain.User;
import com.nuclibrarybackstage.repository.UserRepository;
import com.nuclibrarybackstage.utlis.ResultUtli;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

/**
 * @author aolish333@gmail.com
 * @date 2018/1/11 20:23
 * UserRepository:Lee
 */
@Api(value = "学生信息管理平台",description = "学生基本信息操作API",tags = "StudentApi", consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
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
    @ApiOperation(value = "insertUser", notes = "添加一个学生", code = 201)
    @PostMapping(value = "/user")
    public Result<User> insertUser(@Valid User user , BindingResult bindingResult) {
        if (bindingResult.hasErrors()){
            return ResultUtli.error(1,bindingResult.getFieldError().getDefaultMessage());
        }
        return ResultUtli.success(userRepository.save(user));
    }

    /**
     * 查询所有的用户信息
     *
     * @return
     */
    @ApiOperation(value = "listUsers", notes = "查询所以的用户信息", code = 201)
    @GetMapping(value = "/user")
    public List <User> listUsers() {
        return userRepository.findAll();
    }

    /**
     * 查询一个用户
     *
     * @param studentID 学生学号
     * @return
     */
    @ApiOperation(value = "getUser", notes = "依据学生姓名查询学生信息")
    @GetMapping(value = "/user/{studentID}")
    public User getUser(@PathVariable("studentID") String studentID) {
        return userRepository.findOne(studentID);
    }

    /**
     * 更新用户
     *
     * @param studentID 学生学号
     * @param password  登陆密码
     * @return
     */
    @ApiOperation(value = "updateUser", notes = "修改学生信息", code = 201)
    @PutMapping(value = "/user/{studentID}")
    public User updateUser(@PathVariable("studentID") String studentID,
                           @RequestParam("creditScore") String creditScore,
                           @RequestParam("password") String password) {
        User user = new User();
        user.setCreditScore(creditScore);
        user.setStudentID(studentID);
        user.setPassword(password);
        return userRepository.save(user);
    }

    /**
     * 删除用户
     * @param studentID 学号
     */
    @ApiOperation(value = "deleteUser", notes = "通过学号删除用户", code = 201)
    @DeleteMapping(value = "/user/{studentID}")
    public void deleteUser(@PathVariable("studentID") String studentID) {
        userRepository.delete(studentID);
    }
}