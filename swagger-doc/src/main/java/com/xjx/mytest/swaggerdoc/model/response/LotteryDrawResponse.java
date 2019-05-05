package com.xjx.mytest.swaggerdoc.model.response;

import com.xjx.mytest.swaggerdoc.model.po.LPrizeItem;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.io.Serializable;

/**
 * @program: lottery
 * @description: 抽奖响应数据封装
 * @author: 谢庆香
 * @create: 2019-04-24 17:54
 **/
@ApiModel
@Data
public class LotteryDrawResponse implements Serializable {
    @ApiModelProperty(value = "是否中奖" , notes = "1：中奖，2：不中奖")
    private Integer isLucky ;
    @ApiModelProperty(value = "奖品")
    private LPrizeItem prizeItem ;
}