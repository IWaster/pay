package io.ouka.pay.common.result;

import javax.validation.constraints.Min;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import java.io.UnsupportedEncodingException;
import java.math.BigDecimal;

/**
 * @author ouka
 * @ClassName PaymentRequest
 * @Package io.ouka.pay.common.result
 * @Description: TODO
 * @date 2020/11/25 16:08
 */
public class PaymentRequest extends AbstractRequest{
    private static final long serialVersionUID = 574464508295403067L;

    /**
     * 用户id
     */
    @NotNull(message = "userId不可为空")
    private Long userId;

    /**
     * 交易订单号, 统一生成全局唯一的订单号
     */
    @NotBlank(message = "tradeNo不可为空")
    private String tradeNo;

    /**
     * 实际支付金额(单位为分)
     */
    @Min(value = 0, message = "实际支付金额不能为负数")
    private BigDecimal totalFee;

    /**
     * 订单总金额
     */
    @Min(value = 0, message = "订单总金额不能为负数")
    private BigDecimal orderFee;

    /**
     * 商品描述(必填)
     * 微信支付提交格式要求；支付宝不需要严格控制格式
     * {浏览器打开的网站主页title名 -商品概述}
     */
    @NotBlank(message = "商品描述不能为空")
    private String subject;

    /**
     * 终端IP(非必填)
     */
    private String spbillCreateIp;

    /**
     * 支付渠道（alipay：支付宝  /  wechat_pay：微信）
     */
    private String payChannel;
    /**
     * 地址id
     */
    private Long addressId;

    public static long getSerialVersionUID() {
        return serialVersionUID;
    }

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public String getTradeNo() {
        return tradeNo;
    }

    public void setTradeNo(String tradeNo) {
        this.tradeNo = tradeNo;
    }

    public BigDecimal getTotalFee() {
        return totalFee;
    }

    public void setTotalFee(BigDecimal totalFee) {
        this.totalFee = totalFee;
    }

    public BigDecimal getOrderFee() {
        return orderFee;
    }

    public void setOrderFee(BigDecimal orderFee) {
        this.orderFee = orderFee;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public String getSpbillCreateIp() {
        return spbillCreateIp;
    }

    public void setSpbillCreateIp(String spbillCreateIp) {
        this.spbillCreateIp = spbillCreateIp;
    }

    public String getPayChannel() {
        return payChannel;
    }

    public void setPayChannel(String payChannel) {
        this.payChannel = payChannel;
    }

    public Long getAddressId() {
        return addressId;
    }

    public void setAddressId(Long addressId) {
        this.addressId = addressId;
    }

    @Override
    public void requestCheck() {

    }

    public String getSubject() {
        try {
            return new String(subject.getBytes(),"utf-8");
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        }
        return null;
    }
}
