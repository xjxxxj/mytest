package com.xjx.mytest.swaggerdoc.model.response;

import com.xjx.mytest.swaggerdoc.model.po.LPrizeItem;
import com.xjx.mytest.swaggerdoc.model.po.LTemplate;
import io.swagger.annotations.ApiModel;
import lombok.Data;

import java.util.List;

/**
 * @program: lottery
 * @description:
 * @author: 谢庆香
 * @create: 2019-04-22 11:47
 **/
@ApiModel
@Data
public class TemplateResponse {
    private LTemplate lTemplate ;
    private List<LPrizeItem> prizeItemList ;

    public TemplateResponse(LTemplate lTemplate, List<LPrizeItem> prizeItemList) {
        this.lTemplate = lTemplate;
        this.prizeItemList = prizeItemList;
    }

    public TemplateResponse() {
    }
}