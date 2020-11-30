package io.ouka.pay.common.utils;

import io.ouka.pay.common.result.PaymentRequest;
import io.ouka.pay.common.result.PaymentResponse;
import io.ouka.pay.exception.validator.ValidatorException;
import io.ouka.pay.util.ParamValidatorUtils;
import org.junit.Before;
import org.junit.Test;

/**
 * @author ouka
 * TestParamValidatorUtils
 */
public class TestParamValidatorUtils {
    PaymentRequest paymentRequest;
    PaymentResponse paymentResponse_1;
    PaymentResponse paymentResponse_2;
    ValidatorException validatorException_1;
    @Before
    public void init(){
        paymentRequest = new PaymentRequest();
        paymentResponse_1 = new PaymentResponse();
        paymentResponse_2 = new PaymentResponse();
        validatorException_1 = new ValidatorException("7000","参数校验错误");
    }


    @Test
    public void testEx(){
        System.out.println(ExceptionProcessorUtils.wrapperHandlerException(paymentResponse_1, validatorException_1));

        try {
            ParamValidatorUtils.validateParam(paymentRequest);
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println(e.getMessage());
            System.out.println(e.getCause());
            System.out.println(ExceptionProcessorUtils.wrapperHandlerException(paymentResponse_2, e));
        }

    }
}
