package com.xjx.mytest.swaggerdoc.model.request;

import com.xjx.mytest.swaggerdoc.model.BaseParam;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import javax.validation.constraints.NotNull;

/**
 * @program: lottery
 * @description:
 * @author: 谢庆香
 * @create: 2019-04-23 15:16
 **/
@Data
@ApiModel
public class DoLotteryDrawParam extends BaseParam {
    @ApiModelProperty(value = "商铺id" , name = "shopId" , example = "1001" , required = true , dataType = "String")
    private String shopId;
    /**
     * 抽奖用户会员卡号
     * 表字段 : l_lottery_record.card_id
     */
    @ApiModelProperty(value = "商家名字" , name = "shopName" , example = "美宜佳" , required = true , dataType = "String")
    private String shopName;
    @ApiModelProperty(value = "会员卡号" , name = "cardId" , example = "15626376763" , required = true , dataType = "String")
    @NotNull
    private String cardId;

    @ApiModelProperty(value = "openId" , name = "openId" , example = "15626376763" , dataType = "String")
    private String openId;

    @ApiModelProperty(value = "抽奖活动ID" , name = "lotteryActivityId" , example = "1" , required = true , dataType = "Long")
    @NotNull
    private Long lotteryActivityId;

}