package io.ouka.pay.common.constants;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

/**
 * @author ouka
 * ALiPaymentConfig
 */
@Component
public class ALiPaymentConfig {

    private final String ali_service;

    private final String ali_partner;

    private final String input_charset;

    private final String sign_type;

    private final String notify_url;

    private final String return_url;

    private final String seller_id;

    private String seller_email;

    private final String pay_gateway_new;

    private final String it_b_pay;
    /**
     * 商户的私钥
     */
    private final String private_key;
    /**
     * 支付宝的公钥
     */
    private final String public_key;

    private final String pay_open_gateway;
    /**
     * 退款接口名
     */
    private final String refund_service;
    /**
     * 退款通知地址
     */
    private final String refund_notify_url;

    public ALiPaymentConfig(@Value("${ali.ali_service}") String ali_service,
                            @Value("${ali.ali_partner}") String ali_partner,
                            @Value("${ali.input_charset}") String input_charset,
                            @Value("${ali.sign_type}") String sign_type,
                            @Value("${ali.notify_url}") String notify_url,
                            @Value("${ali.return_url}") String return_url,
                            @Value("${ali.seller_id}") String seller_id,
                            @Value("${ali.seller_email}") String seller_email,
                            @Value("${ali.pay_gateway_new}") String pay_gateway_new,
                            @Value("${ali.it_b_pay}") String it_b_pay,
                            @Value("${ali.private_key}") String private_key,
                            @Value("${ali.public_key}") String public_key,
                            @Value("${ali.pay_open_gateway}") String pay_open_gateway,
                            @Value("${ali.refund_service}") String refund_service,
                            @Value("${ali.refund_notify_url}") String refund_notify_url) {
        this.ali_service = ali_service;
        this.ali_partner = ali_partner;
        this.input_charset = input_charset;
        this.sign_type = sign_type;
        this.notify_url = notify_url;
        this.return_url = return_url;
        this.seller_id = seller_id;
        this.seller_email = seller_email;
        this.pay_gateway_new = pay_gateway_new;
        this.it_b_pay = it_b_pay;
        this.private_key = private_key;
        this.public_key = public_key;
        this.pay_open_gateway = pay_open_gateway;
        this.refund_service = refund_service;
        this.refund_notify_url = refund_notify_url;
    }

    public String getAli_service() {
        return ali_service;
    }

    public String getAli_partner() {
        return ali_partner;
    }

    public String getInput_charset() {
        return input_charset;
    }

    public String getSign_type() {
        return sign_type;
    }

    public String getNotify_url() {
        return notify_url;
    }

    public String getReturn_url() {
        return return_url;
    }

    public String getSeller_id() {
        return seller_id;
    }

    public String getSeller_email() {
        return seller_email;
    }

    public void setSeller_email(String seller_email) {
        this.seller_email = seller_email;
    }

    public String getPay_gateway_new() {
        return pay_gateway_new;
    }

    public String getIt_b_pay() {
        return it_b_pay;
    }

    public String getPrivate_key() {
        return private_key;
    }

    public String getPublic_key() {
        return public_key;
    }

    public String getPay_open_gateway() {
        return pay_open_gateway;
    }

    public String getRefund_service() {
        return refund_service;
    }

    public String getRefund_notify_url() {
        return refund_notify_url;
    }
}
