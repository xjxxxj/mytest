package com.xjx.mytest.swaggerdoc.model.request;

import com.xjx.mytest.swaggerdoc.model.BaseParam;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import org.hibernate.validator.constraints.NotBlank;

import javax.validation.constraints.NotNull;

/**
 * @program: lottery
 * @description: 修改抽奖活动参数封装
 * @author: 谢庆香
 * @create: 2019-04-25 15:52
 **/
@Data
public class LActivityUpdateParam extends BaseParam {
    private String shopName;
    private String shopId;
    @ApiModelProperty(value = "营销活动id" , name = "activityId" , notes = "创建该抽奖活动的营销活动的id" , example = "123455666" , required = true , dataType = "Long")
    @NotNull
    private Long activityId;
    @ApiModelProperty(value = "营销活动类型" , name = "activityType" , notes = "1是支付有礼，2为积分抽奖" , example = "1" , required = true , dataType = "Integer")
    @NotNull
    private Integer activityType ;
    @ApiModelProperty(value = "营销活动名字" , name = "activityName" , notes = "创建该抽奖活动的营销活动的名字" , example = "支付有礼活动" , required = true , dataType = "String")
    @NotBlank
    private String activityName;
    @ApiModelProperty(value = "状态" , name = "status" , notes = "1:有效，2：无效" , example = "1" , required = true , dataType = "Integer")
    @NotNull
    private Integer status;
    @ApiModelProperty(value = "营销活动描述" , name = "description" , notes = "创建该抽奖活动的营销活动的描述" , example = "这是个支付有礼活动" , required = true , dataType = "String")
    @NotBlank
    private String description;
    @ApiModelProperty(value = "抽奖链接" , name = "activityUrl" , notes = "创建改抽奖活动的营销活动的抽奖入口" , example = "http://siss/lottery/pay" , required = true , dataType = "String")
    @NotBlank
    private String activityUrl ;
    @ApiModelProperty(value = "抽奖活动开始时间" , name = "startTime" , example = "1555919263000" , required = true , dataType = "Long")
    @NotNull
    private Long startTime;
    @ApiModelProperty(value = "抽奖活动结束时间" , name = "endTime" , example = "1655919297170" , required = true , dataType = "Long")
    @NotNull
    private Long endTime;
    @ApiModelProperty(value = "参与次数限制类型" , name = "joinTimesType" , notes = "1：没有限制，2:按照每人一共多少次，3：按照每人每天多少次" , example = "1" , required = true , dataType = "Short")
    @NotNull
    private Short joinTimesType;
    @ApiModelProperty(value = "抽奖次数限制" , name = "limitTimes" , notes = "当没有限制是，该值为-1" , example = "-1" , required = true , dataType = "Integer")
    @NotNull
    private Integer limitTimes;

    @ApiModelProperty(value = "免费次数" , name = "freeTimes" , notes = "不送免费抽奖次数则为0" , example = "0" , required = true , dataType = "Integer")
    @NotNull
    private Integer freeTimes;

    @ApiModelProperty(value = "抽奖模板的id" , name = "templateId" , notes = "绑定的抽奖模板的id" , example = "1" , required = true , dataType = "Long")
    @NotNull
    private Long templateId;

    @ApiModelProperty(value = "抽奖模板名称" , name = "templateName" , example = "春节有礼抽奖" , required = true , dataType = "String")
    @NotBlank
    private String templateName;

    @ApiModelProperty(value = "修改人" , name = "updateBy" ,notes = "创建人（编号）" ,example = "100" , required = true , dataType = "Long")
    private Long updateBy;

}