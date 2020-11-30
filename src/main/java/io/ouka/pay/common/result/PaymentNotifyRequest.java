package io.ouka.pay.common.result;

import java.util.Map;

/**
 * @author ouka
 * PaymentNotifyRequest
 */
public class PaymentNotifyRequest extends AbstractRequest{
    private static final long serialVersionUID = 4800404140904865450L;
    /**
     * 支付渠道（alipay：支付宝  /  wechat_pay：微信）
     */
    private String payChannel;
    /**
     * 服务端返回的支付通知结果
     */
    private Map<String,String[]> resultMap;
    /**
     * 微信返回的结果
     */
    private String xml;

    public String getPayChannel() {
        return payChannel;
    }

    public void setPayChannel(String payChannel) {
        this.payChannel = payChannel;
    }

    public Map<String, String[]> getResultMap() {
        return resultMap;
    }

    public void setResultMap(Map<String, String[]> resultMap) {
        this.resultMap = resultMap;
    }

    public String getXml() {
        return xml;
    }

    public void setXml(String xml) {
        this.xml = xml;
    }

    @Override
    public void requestCheck() {

    }
}
