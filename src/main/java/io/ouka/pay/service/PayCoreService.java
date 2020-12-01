package io.ouka.pay.service;

import io.ouka.pay.biz.abs.BasePayment;
import io.ouka.pay.common.result.PaymentNotifyRequest;
import io.ouka.pay.common.result.PaymentNotifyResponse;
import io.ouka.pay.common.result.PaymentRequest;
import io.ouka.pay.common.result.PaymentResponse;
import io.ouka.pay.common.utils.ExceptionProcessorUtils;

/**
 * @author ouka
 * PayCoreService
 */
public class PayCoreService {
    /**
     * 支付
     * @param request 支付请求
     * @return 支付响应
     * TODO 这里面会有异常抛出 现在有两种处理方式  一种是spring的统一异常处理 另外一个是通过工具类的处理{@link ExceptionProcessorUtils}
     */
    public PaymentResponse execPay(PaymentRequest request){
        PaymentResponse paymentResponse = new PaymentResponse();
        try {
            paymentResponse = BasePayment.getPayment(request.getPayChannel()).process(request);
        } catch (Exception e) {
            e.printStackTrace();
            ExceptionProcessorUtils.wrapperHandlerException(paymentResponse,e);
        }

        return paymentResponse;
    }

    /**
     * 支付回调
     * @param request 回调请求
     * @return 回调响应
     * TODO 同上
     */
    public PaymentNotifyResponse paymentResultNotify(PaymentNotifyRequest request){
        PaymentNotifyResponse response=new PaymentNotifyResponse();
        try {
            response=BasePayment.getPayment
                    (request.getPayChannel()).completePayment(request);
        } catch (Exception e) {
            e.printStackTrace();
            ExceptionProcessorUtils.wrapperHandlerException(response,e);
        }

        return response;
    }
}
