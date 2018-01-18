package com.nuclibrarybackstage.controller;

import com.nuclibrarybackstage.domain.Administrator;
import com.nuclibrarybackstage.domain.Result;
import com.nuclibrarybackstage.repository.AdministratorRepository;
import com.nuclibrarybackstage.service.AdministratorService;
import com.nuclibrarybackstage.utlis.ResultUtli;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

/**
 * @author aolish333@gmail.com
 * @date 2018/1/15 9:53
 * User:Lee
 */
@RestController
public class AdministratorController {


    @Autowired
    private AdministratorRepository administratorRepository;

    @Autowired
    AdministratorService administratorService;

    @PostMapping(value = "/administrator")
    public Result<Administrator> administratorAdd(@Valid Administrator administrator , BindingResult bindingResult){
        if (bindingResult.hasErrors()){
            return ResultUtli.error(1,bindingResult.getFieldError().getDefaultMessage());
        }
        return ResultUtli.success(administratorRepository.save(administrator));
    }

    /**
     * 查询所有管理员信息
     *
     * @return 所以管理员的信息
     */
    @ApiOperation(value = "administratorList", notes = "查询所以的用户信息", code = 201)
    @GetMapping(value = "/administrator")
    public List <Administrator> administratorList() {
        return administratorRepository.findAll();
    }


    /**
     * 删除用户
     * @param jobNumber 工号
     */
    @ApiOperation(value = "delete", notes = "删除用户信息", code = 201)
    @DeleteMapping(value = "/administratorList/{jobNumber}")
    public void delete(@PathVariable("jobNumber") Integer jobNumber) {
        administratorRepository.delete(jobNumber);
    }


    /**
     * 修改管理员的权限及密码
     * @param jobNumber
     * @param password
     * @return
     */
    @ApiOperation(value = "userUpdate", notes = "修改学生信息", code = 201)
    @PutMapping(value = "/administratorList/{jobNumber}")
    public Result<Administrator> userUpdate(@PathVariable("jobNumber") Integer jobNumber,
                                            @RequestParam("password") String password) {
        Administrator administrator = new Administrator();
        administrator.setJurisdiction(jobNumber);
        administrator.setPassword(password);
        return ResultUtli.success(administratorRepository.save(administrator));
    }


}
