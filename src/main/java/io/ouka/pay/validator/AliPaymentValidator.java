package io.ouka.pay.validator;

import io.ouka.pay.biz.abs.BaseValidator;
import io.ouka.pay.common.result.AbstractRequest;

/**
 * @author ouka
 * AliPaymentValidator
 */
public class AliPaymentValidator extends BaseValidator {
    @Override
    public void specialValidate(AbstractRequest request) {
        /*校验  后续考虑了下应该还有一些重复支付啥的校验  应该单独抽出来放base里面*/
    }
}
