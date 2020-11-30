package io.ouka.pay.biz.abs;

import io.ouka.pay.common.result.AbstractRequest;
import io.ouka.pay.common.result.AbstractResponse;

/**
 * @author ouka
 * IPayment
 */
public interface IPayment {
    /**
     * 发起支付
     * @param request 支付请求
     * @param <T> 支付响应
     * @return 支付响应
     */
    <T extends AbstractResponse> T  process(AbstractRequest request);

    /**
     * 完成支付
     * @param request request
     * @param <T> t
     * @return t
     */
    <T extends AbstractResponse> T completePayment(AbstractRequest request);
}
