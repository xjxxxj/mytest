package com.xjx.mytest.swaggerdoc.model.request;

import com.xjx.mytest.swaggerdoc.model.BaseParam;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import org.hibernate.validator.constraints.NotEmpty;

import javax.validation.constraints.NotNull;
import java.util.List;

/**
 * @program: lottery
 * @description:
 * @author: 谢庆香
 * @create: 2019-04-19 14:20
 **/
@ApiModel
@Data
public class TemplateStatusParam extends BaseParam {
    private String shopName;
    private String shopId;

    @ApiModelProperty(value = "抽奖模板id集合" , name = "idList"  , notes = "值不要被\"\"包围" , example = "[1118815558105579521,1118818608350326785]" , dataType = "List")
    @NotEmpty
    private List<Long> idList;

    @ApiModelProperty(value = "状态" , name = "status" , notes = "1:有效，2：无效" , example = "1" , required = true , dataType = "Short")
    @NotNull
    private Short status;

    @ApiModelProperty(value = "是否已确认修改" , name = "confirmed" , notes = "1:是，2：否" , example = "1" , required = true , dataType = "Short")
    @NotNull
    private Short confirmed ;

    @ApiModelProperty(value = "修改人" , name = "updatedBy" ,notes = "修改人（编号）" ,example = "100" , required = true , dataType = "Long")
    private Long updatedBy;

}