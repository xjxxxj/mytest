package com.xjx.mytest.swaggerdoc.model.request;

import com.xjx.mytest.swaggerdoc.model.BaseParam;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import org.hibernate.validator.constraints.NotBlank;

import javax.validation.constraints.NotNull;

/**
 * @program: lottery
 * @description:
 * @author: 谢庆香
 * @create: 2019-04-22 09:05
 **/
@ApiModel
@Data
public class PrizeItemParam extends BaseParam {
    @ApiModelProperty(value = "id" , name = "id" , notes = "有就传，没有就不传。比如，在修改奖品库存时就要传，在添加奖品时就不传" , example = "1101" , required = false ,dataType = "Long")
    private Long id ;
    /**
     * 奖项名称，eg:一等奖
     * 表字段 : l_prize_item.name
     */
    @ApiModelProperty(value = "奖项名称" , name = "name" , example = "一等奖" , required = true , dataType = "String")
    @NotBlank
    private String name;

    /**
     * 奖品类型(1：积分，2:优惠券，3：储值卡，4：自定义）
     * 表字段 : l_prize_item.type
     */
    @ApiModelProperty(value = "奖品类型" , name = "type" , notes = "1：积分，2:优惠券，3：储值卡，4：自定义" , example = "1" , required = true , dataType = "Integer")
    @NotNull
    private Integer type;

    /**
     * 奖品真实数量
     * 表字段 : l_prize_item.real_count
     */
    @ApiModelProperty(value = "奖品真实数量" , name = "realCount" , example = "100" , required = true , dataType = "Integer")
    @NotNull
    private Integer realCount;

    /**
     * 展示给用户看的奖品数量
     * 表字段 : l_prize_item.show_count
     */
    @ApiModelProperty(value = "展示数量" , name = "showCount" , example = "200" , required = true , dataType = "Integer")
    @NotNull
    private Integer showCount;

    /**
     * 排序数字，从小到大排序
     * 表字段 : l_prize_item.order_number
     */
    @ApiModelProperty(value = "排序数字" , name = "orderNumber" , notes = "从小到大排序" ,example = "1" , required = true , dataType = "Integer")
    @NotNull
    private Integer orderNumber;

    /**
     * 奖品项值,如果是积分类型奖品，存积分值。如果是优惠券类型奖品，存优惠券id。如果是储存金类型奖品，存储金额数目，如果是自定义奖品，存奖品名称。
     * 表字段 : l_prize_item.prize_value
     */
    @ApiModelProperty(value = "奖品项值" , name = "prizeValue" , notes = "如果是积分类型奖品，存积分值。如果是优惠券类型奖品，存优惠券id。如果是储存金类型奖品，存储金额数目，如果是自定义奖品，存奖品名称" ,example = "5" , required = true , dataType = "String")
    @NotBlank
    private String prizeValue;
    /**
     * 图片地址，自定义类型奖品的图片url。
     * 表字段 : l_prize_item.img_url
     */
    @ApiModelProperty(value = "图片地址" , name = "imgUrl" , notes = "自定义类型奖品的图片url" ,example = "https://timgsa.baidu.com/timg?image&quality=80&size=b9999_10000&sec=1555905832226&di=1c90f7dce3d18d38bc72746de6000d8f&imgtype=0&src=http%3A%2F%2Fpic1.win4000.com%2Fwallpaper%2F8%2F58ac06aaa4974.jpg" , required = true , dataType = "String")
    @NotBlank
    private String imgUrl;
    @ApiModelProperty(value = "是否发生修改" , name = "updated" , notes = "1：发生了修改；2：没有发生修改。添加时为发生了修改。" , example = "2" , dataType = "Integer")
    private Integer updated ;
}