package com.xjx.mytest.swaggerdoc.model.request;

import com.xjx.mytest.swaggerdoc.model.BaseParam;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import org.hibernate.validator.constraints.NotEmpty;

import java.util.List;

/**
 * @program: lottery
 * @description:
 * @author: 谢庆香
 * @create: 2019-04-19 16:15
 **/
@ApiModel
@Data
public class TemplateDeleteParam extends BaseParam {
    private String shopId;
    private String shopName;
    @ApiModelProperty(value = "抽奖模板id集合" , name = "idList" , notes = "值不要被\"\"包围" ,example = "[1118815558105579521,1118818608350326785]" , dataType = "Long")
    @NotEmpty
    private List<Long> idList;

    @ApiModelProperty(value = "修改人" , name = "updatedBy" ,notes = "修改人（编号）" ,example = "100" , required = true , dataType = "Long")
    private Long updatedBy;
}