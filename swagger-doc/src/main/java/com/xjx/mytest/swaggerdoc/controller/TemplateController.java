package com.xjx.mytest.swaggerdoc.controller;

import com.xjx.mytest.swaggerdoc.model.BaseResponse;
import com.xjx.mytest.swaggerdoc.model.po.LTemplate;
import com.xjx.mytest.swaggerdoc.model.request.*;
import com.xjx.mytest.swaggerdoc.model.response.TemplateResponse;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;
import org.springframework.web.bind.annotation.*;

/**
 * @program: lottery
 * @description: 抽奖模板接口
 * @author: 谢庆香
 * @create: 2019-04-18 15:35
 **/
@RestController
@RequestMapping("admin/lottery/template")
@Api(tags = "1、抽奖模板增删改查",position = 1,basePath = "admin/lottery/template")
public class TemplateController {

    @PostMapping
    @ApiOperation(value = "添加抽奖模板" , notes = "post请求，在添加一个新的抽奖模板时调用")
    @ApiResponses({
            @ApiResponse(code = 1000,message = "成功"),
            @ApiResponse(code = 1011,message = "失败")})
    public BaseResponse addTemplate(@RequestBody TemplateAddParam param){
        return new BaseResponse<String>() ;
    }
    @GetMapping("page")
    @ApiOperation(value = "分页查询模板信息" , notes = "get请求，调用说明：" +
            "\n\t1、进入抽奖模板列表页面时调用" +
            "\n\t2、拉取可用抽奖模板列表时调用")
    @ApiResponses({
            @ApiResponse(code = 1000,message = "成功")})
    public BaseResponse<LTemplate> getTemplatePage(TemplatePageParam param){
        BaseResponse<LTemplate> response = new BaseResponse<>();
        response.setData(new LTemplate());
        return response ;
    }
    @GetMapping
    @ApiOperation(value = "根据id查询模板详细信息" , notes = "get请求，调用说明：" +
            "\n\t1、进入修改页面时，根据id查询抽奖模板时调用")
    @ApiResponses({
            @ApiResponse(code = 1000 , message = "成功"),
            @ApiResponse(code = 2001 , message = "失败")})
    public BaseResponse<TemplateResponse> getTemplateById(TemplateGetParam param){
        BaseResponse<TemplateResponse> response = new BaseResponse<>();
        response.setData(new TemplateResponse());
        return response ;
    }
    @PutMapping("/status")
    @ApiOperation(value = "修改模板的状态" , notes = "put请求，调用说明：" +
            "\n\t1、点击使单个模板失效/生效时使用" +
            "\n\t2、使模板批量失效/生效时使用" +
            "\n\t3、如果响应的code为2001，需要用户进一步确定后，重新请求本接口，参数中的confirmed的值为1")
    @ApiResponses({
            @ApiResponse(code = 1000,message = "成功"),
            @ApiResponse(code = 1002 , message = "失败")})
    public BaseResponse<String> changeTemplateStatus(@RequestBody TemplateStatusParam param){
        return new BaseResponse<String>() ;
    }
    @DeleteMapping
    @ApiOperation(value = "删除模板" , notes = "delete请求，调用说明：" +
            "\n\t1、单个/批量删除模板时使用" +
            "\n\t2、使模板批量失效/生效时使用")
    @ApiResponses({
            @ApiResponse(code = 1000,message = "成功")
            ,@ApiResponse(code = 1012 , message = "失败")})
    public BaseResponse deleteTemplateById(@RequestBody TemplateDeleteParam param){
        return new BaseResponse() ;
    }
    @PutMapping
    @ApiOperation(value = "修改模板" , notes = "put请求，调用说明：" +
            "\n\t1、进入修改页面后，点击保存设置时调用"+
            "\n\t2、如果响应的code为2001，需要用户进一步确定后，重新请求本接口，参数中的confirmed的值为1")
    @ApiResponses({
            @ApiResponse(code = 1000 , message = "成功")})
    public BaseResponse<String> updateTemplateById( @RequestBody TemplateUpdateParam param){
        return new BaseResponse<>() ;
    }
}