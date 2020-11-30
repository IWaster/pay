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

    public ValidatorException(String errCode, String errMessage, Object errDetails) {
        super(errCode, errMessage, errDetails);
    }



    @Override
    public String getErrCode() {
        return errCode;
    }

    @Override
    public String getErrMessage() {
        return errMessage;
    }

    @Override
    public Object getDetails() {
        return errDetails;
    }
}
