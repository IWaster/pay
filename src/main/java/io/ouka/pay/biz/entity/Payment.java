package io.ouka.pay.biz.entity;

import java.math.BigDecimal;
import java.util.Date;

/**
 * @author ouka
 * Payment
 */
public class Payment {

    private Long id;

    /**
     * 支付状态
     */
    private String status;

    /**
     * 订单id
     */
    private String orderId;

    /**
     * 产品名称
     */
    private String productName;


    /**
     * 付款方支付金额
     */
    private BigDecimal payerAmount;


    /**
     * 第三方返回单号
     */
    private String payNo;


    /**
     * 付款人id
     */
    private Long payerUid;

    /**
     * 付款人姓名
     */
    private String payerName;


    /**
     * 订单金额
     */
    private BigDecimal orderAmount;

    /**
     * 支付方式
     */
    private String payWay;

    /**
     * 支付成功时间
     */
    private Date paySuccessTime;

    /**
     * 支付完成时间
     */
    private Date completeTime;

    /**
     * 备注
     */
    private String remark;

    private Date createTime;

    private Date updateTime;


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getOrderId() {
        return orderId;
    }

    public void setOrderId(String orderId) {
        this.orderId = orderId;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public BigDecimal getPayerAmount() {
        return payerAmount;
    }

    public void setPayerAmount(BigDecimal payerAmount) {
        this.payerAmount = payerAmount;
    }

    public String getPayNo() {
        return payNo;
    }

    public void setPayNo(String payNo) {
        this.payNo = payNo;
    }

    public Long getPayerUid() {
        return payerUid;
    }

    public void setPayerUid(Long payerUid) {
        this.payerUid = payerUid;
    }

    public String getPayerName() {
        return payerName;
    }

    public void setPayerName(String payerName) {
        this.payerName = payerName;
    }

    public BigDecimal getOrderAmount() {
        return orderAmount;
    }

    public void setOrderAmount(BigDecimal orderAmount) {
        this.orderAmount = orderAmount;
    }

    public String getPayWay() {
        return payWay;
    }

    public void setPayWay(String payWay) {
        this.payWay = payWay;
    }

    public Date getPaySuccessTime() {
        return paySuccessTime;
    }

    public void setPaySuccessTime(Date paySuccessTime) {
        this.paySuccessTime = paySuccessTime;
    }

    public Date getCompleteTime() {
        return completeTime;
    }

    public void setCompleteTime(Date completeTime) {
        this.completeTime = completeTime;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }
}
