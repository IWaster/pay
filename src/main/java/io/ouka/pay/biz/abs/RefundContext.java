package io.ouka.pay.biz.abs;

/**
 * @author ouka
 * @ClassName RefundContext
 * @Package io.ouka.pay.biz.abs
 * @Description: TODO
 * @date 2020/11/25 15:38
 */
public class RefundContext extends Context{
    /** 商城退款流水号*/
    private String refundPlatformNo;
    /**用户id**/
    private Long userId;

    public String getRefundPlatformNo() {
        return refundPlatformNo;
    }

    public void setRefundPlatformNo(String refundPlatformNo) {
        this.refundPlatformNo = refundPlatformNo;
    }

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }
}
