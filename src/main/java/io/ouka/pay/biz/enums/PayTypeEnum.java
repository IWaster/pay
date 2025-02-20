package io.ouka.pay.biz.enums;

/**
 * @author ouka
 * PayTypeEnum
 */
public enum PayTypeEnum {

    ALI_PAY("ali_pay","支付宝支付渠道"),
    WECHAT_PAY("wechat_pay","微信支付渠道"),
    ALI_REFUND("ali_refund","支付宝退款渠道"),
    WECHAT_REFUND("wechat_refund","微信退款渠道");


    private String code;

    private String desc;

    PayTypeEnum(String code, String desc){
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
