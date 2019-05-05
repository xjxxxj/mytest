package com.xjx.mytest.swaggerdoc.model.request;

import com.xjx.mytest.swaggerdoc.model.BaseParam;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;

/**
 * @program: lottery
 * @description:
 * @author: 谢庆香
 * @create: 2019-04-19 09:04
 **/
@ApiModel
@Data
public class TemplatePageParam extends BaseParam {
    private String shopName;
    private String shopId;
    @ApiModelProperty(value = "当前页码" , name = "pageNum" , notes = "第一页为1" , example = "1" , dataType = "Integer" , required = true)
    @NotNull
    @Min(1)
    private Integer pageNum ;

    @ApiModelProperty(value = "每页条数" , name = "pageSize" , example = "10" , dataType = "Integer" , required = true)
    @NotNull
    @Min(1)
    private Integer pageSize ;


    @ApiModelProperty(value = "状态" , name = "status" , notes = "1:有效，2：无效;没有筛选则不传" , example = "1" , dataType = "Short")
    private Short status;

    @ApiModelProperty(value = "是否可用" , name = "usable" , notes = "1:可用，2:不可用无效;没有筛选则不传。可用表示可用绑定改模板" , example = "1" , dataType = "Short")
    private Short usable ;


}