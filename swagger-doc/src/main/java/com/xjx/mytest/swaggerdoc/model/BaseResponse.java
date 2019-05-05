package com.xjx.mytest.swaggerdoc.model;

import lombok.Data;

/**
 * @program: swagger-doc
 * @description:
 * @author: 谢庆香
 * @create: 2019-05-06 00:00
 **/
@Data
public class BaseResponse<T> {

    private Integer code = 1001;

    private String message = "成功";

    private T data ;

    public BaseResponse(Integer code, String message) {
        this.code = code;
        this.message = message;
    }

    public BaseResponse() {
    }
}