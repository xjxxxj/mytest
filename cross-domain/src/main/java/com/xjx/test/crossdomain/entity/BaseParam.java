package com.xjx.test.crossdomain.entity;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

/**
 * @program: mytest
 * @description:
 * @author: 谢庆香
 * @create: 2019-05-08 16:15
 **/
@Data
@ApiModel
public class BaseParam {
    @ApiModelProperty(value = "名字",name = "name")
    private String name ;

}