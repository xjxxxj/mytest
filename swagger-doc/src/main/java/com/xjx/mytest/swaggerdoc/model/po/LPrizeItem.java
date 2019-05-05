package com.xjx.mytest.swaggerdoc.model.po;

import java.io.Serializable;

public class LPrizeItem implements Serializable {
    /**
     * 主键
     * 表字段 : l_prize_item.id
     */
    private Long id;

    /**
     * 店铺ID
     * 表字段 : l_prize_item.shop_id
     */
    private String shopId;

    /**
     * 商家名字
     * 表字段 : l_prize_item.shop_name
     */
    private String shopName;

    /**
     * 奖项名称，eg:一等奖
     * 表字段 : l_prize_item.name
     */
    private String name;

    /**
     * 奖品类型(1：积分，2:优惠券，3：储值卡，4：自定义）
     * 表字段 : l_prize_item.type
     */
    private Integer type;

    /**
     * 奖品真实数量
     * 表字段 : l_prize_item.real_count
     */
    private Integer realCount;

    /**
     * 展示给用户看的奖品数量
     * 表字段 : l_prize_item.show_count
     */
    private Integer showCount;

    /**
     * 排序数字，从小到大排序
     * 表字段 : l_prize_item.order_number
     */
    private Integer orderNumber;

    /**
     * 奖品项值,如果是积分类型奖品，存积分值。如果是优惠券类型奖品，存优惠券id。如果是储存金类型奖品，存储金额数目，如果是自定义奖品，存奖品名称。
     * 表字段 : l_prize_item.prize_value
     */
    private String prizeValue;

    /**
     * 关联的抽奖模板id
     * 表字段 : l_prize_item.template_id
     */
    private Long templateId;

    /**
     * 图片地址，自定义类型奖品的图片url。
     * 表字段 : l_prize_item.img_url
     */
    private String imgUrl;

    /**
     * 创建时间（时间戳，单位：ms)
     * 表字段 : l_prize_item.created_time
     */
    private Long createdTime;

    /**
     * 创建人（编号）
     * 表字段 : l_prize_item.created_by
     */
    private Long createdBy;

    /**
     * 修改时间（时间戳，单位：ms)
     * 表字段 : l_prize_item.updated_time
     */
    private Long updatedTime;

    /**
     * 修改人（编号）
     * 表字段 : l_prize_item.updated_by
     */
    private Long updatedBy;

    /**
     * 是否逻辑删除，1：未删除，2：已删除
     * 表字段 : l_prize_item.deleted
     */
    private Short deleted;

    private static final long serialVersionUID = 1L;

    public LPrizeItem(Long id, String shopId, String shopName, String name, Integer type, Integer realCount, Integer showCount, Integer orderNumber, String prizeValue, Long templateId, String imgUrl, Long createdTime, Long createdBy, Long updatedTime, Long updatedBy, Short deleted) {
        this.id = id;
        this.shopId = shopId;
        this.shopName = shopName;
        this.name = name;
        this.type = type;
        this.realCount = realCount;
        this.showCount = showCount;
        this.orderNumber = orderNumber;
        this.prizeValue = prizeValue;
        this.templateId = templateId;
        this.imgUrl = imgUrl;
        this.createdTime = createdTime;
        this.createdBy = createdBy;
        this.updatedTime = updatedTime;
        this.updatedBy = updatedBy;
        this.deleted = deleted;
    }

    public LPrizeItem() {
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

    public Integer getType() {
        return type;
    }

    public void setType(Integer type) {
        this.type = type;
    }

    public Integer getRealCount() {
        return realCount;
    }

    public void setRealCount(Integer realCount) {
        this.realCount = realCount;
    }

    public Integer getShowCount() {
        return showCount;
    }

    public void setShowCount(Integer showCount) {
        this.showCount = showCount;
    }

    public Integer getOrderNumber() {
        return orderNumber;
    }

    public void setOrderNumber(Integer orderNumber) {
        this.orderNumber = orderNumber;
    }

    public String getPrizeValue() {
        return prizeValue;
    }

    public void setPrizeValue(String prizeValue) {
        this.prizeValue = prizeValue == null ? null : prizeValue.trim();
    }

    public Long getTemplateId() {
        return templateId;
    }

    public void setTemplateId(Long templateId) {
        this.templateId = templateId;
    }

    public String getImgUrl() {
        return imgUrl;
    }

    public void setImgUrl(String imgUrl) {
        this.imgUrl = imgUrl == null ? null : imgUrl.trim();
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
        sb.append(", type=").append(type);
        sb.append(", realCount=").append(realCount);
        sb.append(", showCount=").append(showCount);
        sb.append(", orderNumber=").append(orderNumber);
        sb.append(", prizeValue=").append(prizeValue);
        sb.append(", templateId=").append(templateId);
        sb.append(", imgUrl=").append(imgUrl);
        sb.append(", createdTime=").append(createdTime);
        sb.append(", createdBy=").append(createdBy);
        sb.append(", updatedTime=").append(updatedTime);
        sb.append(", updatedBy=").append(updatedBy);
        sb.append(", deleted=").append(deleted);
        sb.append("]");
        return sb.toString();
    }
}