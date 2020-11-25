package io.ouka.pay.context;

import io.ouka.pay.biz.abs.Context;
import io.ouka.pay.biz.abs.PaymentContext;

/**
 * @author ouka
 * @ClassName ALiPaymentContext
 * @Package io.ouka.pay.context
 * @Description: TODO
 * @date 2020/11/25 16:08
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
