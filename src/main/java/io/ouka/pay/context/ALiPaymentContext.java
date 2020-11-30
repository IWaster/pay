package io.ouka.pay.context;

import io.ouka.pay.biz.abs.PaymentContext;

/**
 * @author ouka
 * ALiPaymentContext
 */
public class ALiPaymentContext extends PaymentContext {
    /** 商品名称（必填）*/
    private String subject;

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }
}
