package com.xjx.mytest.swaggerdoc.model.request;

import com.xjx.mytest.swaggerdoc.model.BaseParam;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

/**
 * @program: lottery
 * @description: 抽奖活动删除参数封装
 * @author: 谢庆香
 * @create: 2019-04-25 17:06
 **/
@Data
public class LActivityParam  extends BaseParam {

    private String shopName;
    private String shopId;
    @ApiModelProperty(value = "营销活动id" , name = "activityId" , notes = "不需要则不填" , example = "123455666" , dataType = "Long")
    private Long activityId;
    @ApiModelProperty(value = "抽奖模板的id" , name = "templateId" , notes = "不需要则不填" , example = "1"  , dataType = "Long")
    private Long templateId;
    @ApiModelProperty(value = "抽奖活动的id" , name = "lotteryActivityId" , notes = "不需要则不填" , example = "1" , dataType = "Long")
    private Long lotteryActivityId ;

}