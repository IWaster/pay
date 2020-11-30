package io.ouka.pay.exception.validator;

import io.ouka.pay.exception.BaseException;

/**
 * @author ouka
 * ValidatorException
 */
public class ValidatorException extends BaseException {
    public ValidatorException(String errCode, String errMessage) {
        super(errCode, errMessage);
    }

    @Override
    public String getErrCode() {
        return errCode;
    }

    @Override
    public String getErrMessage() {
        return errMessage;
    }
}
