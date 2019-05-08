package com.xjx.test.crossdomain.controller;

import com.xjx.test.crossdomain.dao.Depository;
import com.xjx.test.crossdomain.entity.BaseParam;
import com.xjx.test.crossdomain.entity.User;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Random;

/**
 * @program: mytest
 * @description:
 * @author: 谢庆香
 * @create: 2019-05-08 16:06
 **/
@RestController
@Api
public class TestController {

    @GetMapping("test")
    @ApiResponses({
            @ApiResponse(code = 1000 , message = "success")
    })
    public User get(BaseParam param){
        System.out.println(param) ;
        return Depository.userMap.get(new Long(new Random().nextInt(10))) ;
    }

}