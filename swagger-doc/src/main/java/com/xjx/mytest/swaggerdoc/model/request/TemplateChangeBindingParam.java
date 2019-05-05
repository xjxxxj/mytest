package com.xjx.mytest.swaggerdoc.model.request;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import org.hibernate.validator.constraints.NotBlank;

import javax.validation.constraints.NotNull;
import java.io.Serializable;

/**
 * @program: lottery
 * @description: 抽奖模板解绑参数封装
 * @author: 谢庆香
 * @create: 2019-04-26 17:41
 **/
@Data
public class TemplateChangeBindingParam implements Serializable {

    @ApiModelProperty(value = "商铺id" , name = "shopId" , example = "1001" , required = true , dataType = "String")
    @NotBlank
    private String shopId;
    @ApiModelProperty(value = "抽奖模板的id" , name = "templateId", example = "1"  , dataType = "Long")
    @NotNull
    private Long templateId;
    @ApiModelProperty(value = "营销活动id" , name = "activityId"  , example = "123455666" , dataType = "Long")
    @NotNull
    private Long activityId;
    @ApiModelProperty(value = "营销活动类型" , name = "activityType")
    private Integer activityType;
    @ApiModelProperty(value = "营销活动结束时间" , name = "endTime" , example = "1655919297170" ,dataType = "Long")
    private Long endTime;
        @ApiModelProperty(value = "是否绑定" , name = "bindingStatus" , notes = "1:绑定，2：解绑" , example = "1")
    @NotNull
    private Integer bindingStatus ;

}