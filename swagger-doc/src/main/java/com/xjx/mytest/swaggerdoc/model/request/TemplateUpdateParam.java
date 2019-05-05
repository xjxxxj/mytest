package com.xjx.mytest.swaggerdoc.model.request;

import com.xjx.mytest.swaggerdoc.model.BaseParam;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import javax.validation.constraints.NotNull;
import java.util.List;

/**
 * @program: lottery
 * @description:
 * @author: 谢庆香
 * @create: 2019-04-19 17:06
 **/
@ApiModel
@Data
public class TemplateUpdateParam extends BaseParam {
    private String shopId;
    private String shopName;
    @ApiModelProperty(value = "模板id" , name = "id" , example = "1001" , required = true , dataType = "Long")
    @NotNull
    private Long id ;

    @ApiModelProperty(value = "模板名称" , name = "name" , example = "幸运抽奖" , required = true , dataType = "String")
    @NotNull
    private String name;

    @ApiModelProperty(value = "抽奖样式id" , name = "styleId" , example = "1" , required = false , dataType = "String")
    private String styleId;

    @ApiModelProperty(value = "抽奖样式名称" , name = "styleName" , example = "九宫格" , required = true , dataType = "String")
    @NotNull
    private String styleName;

    @ApiModelProperty(value = "说明" , name = "description" , example = "春节活动" , required = false , dataType = "String")
    private String description;

    @ApiModelProperty(value = "奖品项最大数" , name = "prizeNumMax" ,notes = "不同抽奖样式的奖品项允许的最大数量可能不同" ,example = "8" , required = true , dataType = "Integer")
    @NotNull
    private Integer prizeNumMax;

    @ApiModelProperty(value = "配送方式" , name = "deliveryType" ,notes = "1:无 , 2:门店自提,3:送货上门,4:门店自提+送货上门" , example = "1" , required = true , dataType = "Integer")
    @NotNull
    private Integer deliveryType;

    @ApiModelProperty(value = "状态" , name = "status" , notes = "1:有效，2：无效" , example = "1" , required = true , dataType = "Short")
    @NotNull
    private Short status;

    @ApiModelProperty(value = "中奖总概率" , name = "winRate" , notes = "整数,单位：1/100" , example = "50" , required = true , dataType = "Integer")
    @NotNull
    private Integer winRate;

    @ApiModelProperty(value = "限制门店" , name = "deliveryLimit" ,notes = "奖品门店自取的限制门店，json格式" ,example = "[{\"id\":\"001\",\"name\":\"南山店\"},{\"id\":\"002\",\"name\":\"宝安店\"}]" , required = false , dataType = "String")
    private String deliveryLimit;

    private List<PrizeItemParam> prizeItemList ;

    @ApiModelProperty(value = "修改人" , name = "updatedBy" ,notes = "修改人（编号）" ,example = "100" , required = true , dataType = "Long")
    private Long updatedBy;

    @ApiModelProperty(value = "是否已确认修改" , name = "confirmed" , notes = "1:是，2：否" , example = "1" , required = true , dataType = "Short")
    @NotNull
    private Short confirmed ;

}