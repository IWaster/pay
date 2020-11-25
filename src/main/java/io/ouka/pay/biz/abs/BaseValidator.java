package io.ouka.pay.biz.abs;

import io.ouka.pay.common.result.AbstractRequest;
import io.ouka.pay.util.ParamValidatorUtils;

/**
 * @author ouka
 * @ClassName BaseValidator
 * @Package io.ouka.pay.biz.abs
 * @Description: TODO
 * @date 2020/11/25 14:23
 */
public abstract class BaseValidator implements Validator{

    @Override
    public void validate(AbstractRequest request) {
        //简单的参数校验javax自带的
        ParamValidatorUtils.validateParam(request);
        //特殊的参数校验 有可能涉及到业务的
        specialValidate(request);
    }

    public abstract void specialValidate(AbstractRequest request);
}
