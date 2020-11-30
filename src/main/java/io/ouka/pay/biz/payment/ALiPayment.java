package io.ouka.pay.biz.payment;

import io.ouka.pay.biz.abs.BasePayment;
import io.ouka.pay.biz.abs.Context;
import io.ouka.pay.biz.abs.Validator;
import io.ouka.pay.common.constants.ALiPaymentConfig;
import io.ouka.pay.common.result.AbstractRequest;
import io.ouka.pay.common.result.AbstractResponse;
import io.ouka.pay.common.result.PaymentRequest;
import io.ouka.pay.context.ALiPaymentContext;

import java.util.SortedMap;

/**
 * @author ouka
 * ALiPayment
 */
public class ALiPayment extends BasePayment {

    private Validator validator;
    private ALiPaymentConfig aliPaymentConfig;

    @Override
    public String getPayChannel() {
        return null;
    }

    @Override
    public Validator getValidator() {
        return validator;
    }

    @Override
    public Context createContext(AbstractRequest request) {
        ALiPaymentContext aliPaymentContext = new ALiPaymentContext();
        PaymentRequest paymentRequest = (PaymentRequest) request;
        aliPaymentContext.setSubject(paymentRequest.getSubject());
        aliPaymentContext.setOutTradeNo(paymentRequest.getTradeNo());
        aliPaymentContext.setTotalFee(paymentRequest.getTotalFee());
        aliPaymentContext.setUserId(paymentRequest.getUserId());
        return aliPaymentContext;
    }
    @Override
    public void prepare(AbstractRequest request, Context context)  {
        super.prepare(request, context);
        SortedMap<String, Object> sParaTemp = context.getsParaTemp();
        ALiPaymentContext aliPaymentContext = (ALiPaymentContext) context;
        sParaTemp.put("partner", aliPaymentConfig.getAli_partner());
        sParaTemp.put("service", aliPaymentConfig.getAli_service());
        //sParaTemp.put("seller_email", aliPaymentConfig.getSeller_email());
        sParaTemp.put("seller_id", aliPaymentConfig.getSeller_id());
        sParaTemp.put("payment_type", "1");
        sParaTemp.put("it_b_pay", aliPaymentConfig.getIt_b_pay());
        sParaTemp.put("notify_url", aliPaymentConfig.getNotify_url());
        sParaTemp.put("return_url", aliPaymentConfig.getReturn_url());
        sParaTemp.put("out_trade_no", aliPaymentContext.getOutTradeNo());
        sParaTemp.put("subject", aliPaymentContext.getSubject());
        sParaTemp.put("total_fee", aliPaymentContext.getTotalFee());
        aliPaymentContext.setsParaTemp(sParaTemp);
    }
    @Override
    public AbstractResponse generalProcess(AbstractRequest request, Context context) {
        return null;
    }

    @Override
    public void afterProcess(AbstractRequest request, AbstractResponse respond, Context context) {

    }

    @Override
    public <T extends AbstractResponse> T completePayment(AbstractRequest request) {
        /**
         * 获取参数  检验  落库 返回
         */
        return null;
    }


}
