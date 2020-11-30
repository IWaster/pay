package io.ouka.pay.service;

import io.ouka.pay.biz.abs.BasePayment;
import io.ouka.pay.common.result.PaymentNotifyRequest;
import io.ouka.pay.common.result.PaymentNotifyResponse;
import io.ouka.pay.common.result.PaymentRequest;
import io.ouka.pay.common.result.PaymentResponse;

/**
 * @author ouka
 * PayCoreService
 */
public class PayCoreService {

    public PaymentResponse execPay(PaymentRequest request){
        PaymentResponse paymentResponse = new PaymentResponse();
        paymentResponse = BasePayment.paymentMap.get(request.getPayChannel()).process(request);

        return paymentResponse;
    }


    public PaymentNotifyResponse paymentResultNotify(PaymentNotifyRequest request){
        PaymentNotifyResponse response=new PaymentNotifyResponse();
        response=BasePayment.paymentMap.get
                (request.getPayChannel()).completePayment(request);

        return response;
    }
}
