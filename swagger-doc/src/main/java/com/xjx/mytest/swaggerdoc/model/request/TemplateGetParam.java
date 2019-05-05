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
 * @create: 2019-04-22 11:13
 **/
@ApiModel
@Data
public class TemplateGetParam extends BaseParam {
    private String shopName;
    private String shopId;
    @ApiModelProperty(value = "抽奖模板id" , name = "id"  , example = "1001" , required = true ,dataType = "Long")
    @NotNull
    private Long id;

    public TemplateGetParam() {
    }

    public TemplateGetParam(String shopId, Long id) {
        setShopId(shopId);
        this.id = id;
    }
}