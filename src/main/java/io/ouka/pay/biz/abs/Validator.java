package io.ouka.pay.biz.abs;


import io.ouka.pay.common.result.AbstractRequest;

public interface Validator {
    /**
     * 数据验证
     * @param request
     */
    void validate(AbstractRequest request);
}
