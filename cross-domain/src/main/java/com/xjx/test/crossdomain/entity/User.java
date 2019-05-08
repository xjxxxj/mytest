package com.xjx.test.crossdomain.entity;

import lombok.Data;

import java.io.Serializable;
import java.util.List;

/**
 * @program: mytest
 * @description:
 * @author: 谢庆香
 * @create: 2019-05-08 16:08
 **/
@Data
public class User implements Serializable {

    private String name ;
    private Integer age ;
    private List<String> hobbies ;

}