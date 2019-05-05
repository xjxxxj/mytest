package com.xjx.mytest.swaggerdoc.model.request;

import com.xjx.mytest.swaggerdoc.model.BaseParam;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;

/**
 * @program: lottery
 * @description:
 * @author: 谢庆香
 * @create: 2019-04-25 18:14
 **/
@Data
@ApiModel
public class AppLActivityQueryParam extends BaseParam {

    @ApiModelProperty(value = "商铺id" , name = "shopId" , example = "1001" , required = true , dataType = "String")
    private String shopId;
    @ApiModelProperty(value = "openID" , name = "openId" , example = "1001" , required = true , dataType = "String")
    private String openId ;
    @ApiModelProperty(value = "会员卡号" , name = "cardId" , example = "1001" , required = true , dataType = "String")
    private String cardId ;
    @ApiModelProperty(value = "商家名字" , name = "shopName" , example = "美宜佳" , required = true , dataType = "String")
    private String shopName;
    @ApiModelProperty(value = "营销活动id" , name = "activityId" , notes = "不需要则不填" , example = "123455666" , dataType = "Long")
    private Long activityId;
    @ApiModelProperty(value = "当前页码" , name = "pageNum" , example = "1" , required = true ,dataType = "Integer")
    @NotNull
    @Min(1)
    private Integer pageNum = 1 ;
    @ApiModelProperty(value = "每页显示条数" , name = "pageSize" , example = "10" , required = true ,dataType = "Integer")
    @NotNull
    @Min(1)
    private Integer pageSize = 10 ;
}