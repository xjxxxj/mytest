package com.xjx.mytest.swaggerdoc.model.request;

import com.xjx.mytest.swaggerdoc.model.BaseParam;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

/**
 * @program: lottery
 * @description:
 * @author: 谢庆香
 * @create: 2019-04-25 18:14
 **/
@Data
@ApiModel
public class LActivityQueryParam extends BaseParam {
    private String shopName;
    private String shopId;
    @ApiModelProperty(value = "营销活动id" , name = "activityId" , notes = "不需要则不填" , example = "123455666" , dataType = "Long")
    private Long activityId;
    @ApiModelProperty(value = "抽奖模板的id" , name = "templateId" , notes = "不需要则不填" , example = "1"  , dataType = "Long")
    private Long templateId;
    @ApiModelProperty(value = "抽奖模板的id" , name = "templateId" , notes = "不需要则不填" , example = "1" , dataType = "Long")
    private Long lotteryActivityId ;
    @ApiModelProperty(value = "状态" , name = "status" , notes = "1:有效，2：无效,不需要则不填" , example = "1" , dataType = "Integer")
    private Integer status;
    @ApiModelProperty(value = "是否正在进行" , name = "running" , notes = "1:正在进行，2：不在进行，不需要不填" , example = "1" , dataType = "Integer")
    private Integer running ;
}