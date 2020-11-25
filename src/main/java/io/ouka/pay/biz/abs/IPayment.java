package io.ouka.pay.biz.abs;

import io.ouka.pay.common.result.AbstractRequest;
import io.ouka.pay.common.result.AbstractResponse;

/**
 * @author ouka
 * @ClassName IPayment
 * @Package io.ouka.pay.biz.abs
 * @Description: TODO
 * @date 2020/11/25 10:54
 */
public interface IPayment {
    /**
     * 发起支付
     * @param request 支付请求
     * @param <T> 支付响应
     * @return 支付响应
     */
    <T extends AbstractResponse> T  process(AbstractRequest request);

    <T extends AbstractResponse> T completePayment(AbstractRequest request);
}
