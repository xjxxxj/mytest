package com.xjx.mytest.swaggerdoc.model.request;

import com.xjx.mytest.swaggerdoc.model.BaseParam;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import org.hibernate.validator.constraints.NotBlank;

import javax.validation.constraints.NotNull;
import java.util.List;

/**
 * @program: lottery
 * @description:批量创建抽奖活动的参数封装
 * @author: 谢庆香
 * @create: 2019-04-22 15:35
 **/
@ApiModel
@Data
public class ActivityAddBatchParamAdmin extends BaseParam {
    private String shopId;
    private String shopName;
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

    @ApiModelProperty(value = "创建人" , name = "createdBy" ,notes = "创建人（编号）" ,example = "100" , required = true , dataType = "Long")
    private Long createdBy;

    private List<ActivityAddParam> activityList ;

}