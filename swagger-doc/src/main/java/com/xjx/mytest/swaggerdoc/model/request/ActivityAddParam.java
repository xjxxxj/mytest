package com.xjx.mytest.swaggerdoc.model.request;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import org.hibernate.validator.constraints.NotBlank;

import javax.validation.constraints.NotNull;
import java.io.Serializable;

/**
 * @program: lottery
 * @description:单个抽奖活动的部分信息封装，本类为ActivityAddBatchParam服务
 * @author: 谢庆香
 * @create: 2019-04-22 15:50
 **/
@ApiModel
@Data
public class ActivityAddParam implements Serializable {
    /**
     * 参与次数类型,1：没有限制，2:按照每人一共多少次，3：按照每人每天多少次
     * 表字段 : l_activity.join_times_type
     */
    @ApiModelProperty(value = "参与次数限制类型" , name = "joinTimesType" , notes = "1：没有限制，2:按照每人一共多少次，3：按照每人每天多少次" , example = "1" , required = true , dataType = "Short")
    @NotNull
    private Short joinTimesType;

    /**
     * 抽奖次数限制
     * 表字段 : l_activity.limit_times
     */
    @ApiModelProperty(value = "抽奖次数限制" , name = "limitTimes" , notes = "当没有限制是，该值为-1" , example = "-1" , required = true , dataType = "Integer")
    @NotNull
    private Integer limitTimes;
    /**
     * 免费次数
     * 表字段 : l_activity.free_times
     */
    @ApiModelProperty(value = "免费次数" , name = "freeTimes" , notes = "不送免费抽奖次数则为0" , example = "0" , required = true , dataType = "Integer")
    @NotNull
    private Integer freeTimes;

    /**
     * 绑定的抽奖模板的id
     * 表字段 : l_activity.template_id
     */
    @ApiModelProperty(value = "抽奖模板的id" , name = "templateId" , notes = "绑定的抽奖模板的id" , example = "1" , required = true , dataType = "Long")
    @NotNull
    private Long templateId;

    /**
     * 抽奖模板名称
     * 表字段 : l_activity.template_name
     */
    @ApiModelProperty(value = "抽奖模板名称" , name = "templateName" , example = "春节有礼抽奖" , required = true , dataType = "String")
    @NotBlank
    private String templateName;
}