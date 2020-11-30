package io.ouka.pay.biz.entity;

/**
 * @author ouka
 * PayResultEnum
 */
public enum PayResultEnum {
    TRADE_PROCESSING("1","支付处理中"),
    TRADE_FINISHED ("2","支付完成"),
    TRADE_SUCCESS ("3","支付成功"),
    FAIL("4","支付失败");

    private String code;

    private String desc;

    PayResultEnum(String code, String desc){
        this.code=code;
        this.desc=desc;
    }

    public String getCode() {
        return code;
    }

    public String getDesc() {
        return desc;
    }
}
