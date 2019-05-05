package com.xjx.mytest.swaggerdoc.model.po;

import java.io.Serializable;

public class LTemplate implements Serializable {
    /**
     * 主键
     * 表字段 : l_template.id
     */
    private Long id;

    /**
     * 店铺ID
     * 表字段 : l_template.shop_id
     */
    private String shopId;

    /**
     * 商家名字
     * 表字段 : l_template.shop_name
     */
    private String shopName;

    /**
     * 模板名称
     * 表字段 : l_template.name
     */
    private String name;

    /**
     * 抽奖样式id
     * 表字段 : l_template.style_id
     */
    private String styleId;

    /**
     * 抽奖样式名称
     * 表字段 : l_template.style_name
     */
    private String styleName;

    /**
     * 说明
     * 表字段 : l_template.description
     */
    private String description;

    /**
     * 奖品项最大数(不同抽奖样式的奖品项允许的最大数量可能不同）
     * 表字段 : l_template.prize_num_max
     */
    private Integer prizeNumMax;

    /**
     * 配送方式,1:无 , 2:门店自提,3:送货上门,4:门店自提+送货上门
     * 表字段 : l_template.delivery_type
     */
    private Integer deliveryType;

    /**
     * 1:有效，2：无效
     * 表字段 : l_template.status
     */
    private Short status;

    /**
     * 中奖总概率（整数）
     * 表字段 : l_template.win_rate
     */
    private Integer winRate;

    /**
     * 奖品门店自取的限制门店，存json格式，多个门店逗号隔开。eg:[{"id":"001","name":"南山店"},{"id":"002","name":"宝安店"}]
     * 表字段 : l_template.delivery_limit
     */
    private String deliveryLimit;

    /**
     * 奖品真实总数量
     * 表字段 : l_template.prize_real_num
     */
    private Integer prizeRealNum;

    /**
     * 奖品展示总数量
     * 表字段 : l_template.prize_show_num
     */
    private Integer prizeShowNum;

    /**
     * 本模板绑定的最后一个活动的类型，1：积分抽奖活动，2：支付有礼活动
     * 表字段 : l_template.activity_type
     */
    private Integer activityType;

    /**
     * 本模板绑定的最后一个活动的id
     * 表字段 : l_template.activity_id
     */
    private Long activityId;

    /**
     * 模板可回收时间，本值（时间戳，单位：ms)来源如下：1、模板创建时为当前时间；2、绑定活动时为活动结束时间；3、修改绑定活动的结束时间时为活动结束时间；4、解绑时为当前时间
     * 表字段 : l_template.recyclable_time
     */
    private Long recyclableTime;

    /**
     * 创建时间（时间戳，单位：ms)
     * 表字段 : l_template.created_time
     */
    private Long createdTime;

    /**
     * 创建人（编号）
     * 表字段 : l_template.created_by
     */
    private Long createdBy;

    /**
     * 修改时间（时间戳，单位：ms)
     * 表字段 : l_template.updated_time
     */
    private Long updatedTime;

    /**
     * 修改人（编号）
     * 表字段 : l_template.updated_by
     */
    private Long updatedBy;

    /**
     * 是否逻辑删除，1：未删除，2：已删除
     * 表字段 : l_template.deleted
     */
    private Short deleted;

    private static final long serialVersionUID = 1L;

    public LTemplate(Long id, String shopId, String shopName, String name, String styleId, String styleName, String description, Integer prizeNumMax, Integer deliveryType, Short status, Integer winRate, String deliveryLimit, Integer prizeRealNum, Integer prizeShowNum, Integer activityType, Long activityId, Long recyclableTime, Long createdTime, Long createdBy, Long updatedTime, Long updatedBy, Short deleted) {
        this.id = id;
        this.shopId = shopId;
        this.shopName = shopName;
        this.name = name;
        this.styleId = styleId;
        this.styleName = styleName;
        this.description = description;
        this.prizeNumMax = prizeNumMax;
        this.deliveryType = deliveryType;
        this.status = status;
        this.winRate = winRate;
        this.deliveryLimit = deliveryLimit;
        this.prizeRealNum = prizeRealNum;
        this.prizeShowNum = prizeShowNum;
        this.activityType = activityType;
        this.activityId = activityId;
        this.recyclableTime = recyclableTime;
        this.createdTime = createdTime;
        this.createdBy = createdBy;
        this.updatedTime = updatedTime;
        this.updatedBy = updatedBy;
        this.deleted = deleted;
    }

    public LTemplate() {
        super();
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getShopId() {
        return shopId;
    }

    public void setShopId(String shopId) {
        this.shopId = shopId == null ? null : shopId.trim();
    }

    public String getShopName() {
        return shopName;
    }

    public void setShopName(String shopName) {
        this.shopName = shopName == null ? null : shopName.trim();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public String getStyleId() {
        return styleId;
    }

    public void setStyleId(String styleId) {
        this.styleId = styleId == null ? null : styleId.trim();
    }

    public String getStyleName() {
        return styleName;
    }

    public void setStyleName(String styleName) {
        this.styleName = styleName == null ? null : styleName.trim();
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description == null ? null : description.trim();
    }

    public Integer getPrizeNumMax() {
        return prizeNumMax;
    }

    public void setPrizeNumMax(Integer prizeNumMax) {
        this.prizeNumMax = prizeNumMax;
    }

    public Integer getDeliveryType() {
        return deliveryType;
    }

    public void setDeliveryType(Integer deliveryType) {
        this.deliveryType = deliveryType;
    }

    public Short getStatus() {
        return status;
    }

    public void setStatus(Short status) {
        this.status = status;
    }

    public Integer getWinRate() {
        return winRate;
    }

    public void setWinRate(Integer winRate) {
        this.winRate = winRate;
    }

    public String getDeliveryLimit() {
        return deliveryLimit;
    }

    public void setDeliveryLimit(String deliveryLimit) {
        this.deliveryLimit = deliveryLimit == null ? null : deliveryLimit.trim();
    }

    public Integer getPrizeRealNum() {
        return prizeRealNum;
    }

    public void setPrizeRealNum(Integer prizeRealNum) {
        this.prizeRealNum = prizeRealNum;
    }

    public Integer getPrizeShowNum() {
        return prizeShowNum;
    }

    public void setPrizeShowNum(Integer prizeShowNum) {
        this.prizeShowNum = prizeShowNum;
    }

    public Integer getActivityType() {
        return activityType;
    }

    public void setActivityType(Integer activityType) {
        this.activityType = activityType;
    }

    public Long getActivityId() {
        return activityId;
    }

    public void setActivityId(Long activityId) {
        this.activityId = activityId;
    }

    public Long getRecyclableTime() {
        return recyclableTime;
    }

    public void setRecyclableTime(Long recyclableTime) {
        this.recyclableTime = recyclableTime;
    }

    public Long getCreatedTime() {
        return createdTime;
    }

    public void setCreatedTime(Long createdTime) {
        this.createdTime = createdTime;
    }

    public Long getCreatedBy() {
        return createdBy;
    }

    public void setCreatedBy(Long createdBy) {
        this.createdBy = createdBy;
    }

    public Long getUpdatedTime() {
        return updatedTime;
    }

    public void setUpdatedTime(Long updatedTime) {
        this.updatedTime = updatedTime;
    }

    public Long getUpdatedBy() {
        return updatedBy;
    }

    public void setUpdatedBy(Long updatedBy) {
        this.updatedBy = updatedBy;
    }

    public Short getDeleted() {
        return deleted;
    }

    public void setDeleted(Short deleted) {
        this.deleted = deleted;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", shopId=").append(shopId);
        sb.append(", shopName=").append(shopName);
        sb.append(", name=").append(name);
        sb.append(", styleId=").append(styleId);
        sb.append(", styleName=").append(styleName);
        sb.append(", description=").append(description);
        sb.append(", prizeNumMax=").append(prizeNumMax);
        sb.append(", deliveryType=").append(deliveryType);
        sb.append(", status=").append(status);
        sb.append(", winRate=").append(winRate);
        sb.append(", deliveryLimit=").append(deliveryLimit);
        sb.append(", prizeRealNum=").append(prizeRealNum);
        sb.append(", prizeShowNum=").append(prizeShowNum);
        sb.append(", activityType=").append(activityType);
        sb.append(", activityId=").append(activityId);
        sb.append(", recyclableTime=").append(recyclableTime);
        sb.append(", createdTime=").append(createdTime);
        sb.append(", createdBy=").append(createdBy);
        sb.append(", updatedTime=").append(updatedTime);
        sb.append(", updatedBy=").append(updatedBy);
        sb.append(", deleted=").append(deleted);
        sb.append("]");
        return sb.toString();
    }
}