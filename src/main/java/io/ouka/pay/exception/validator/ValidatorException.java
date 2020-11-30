package io.ouka.pay.exception.validator;

import com.alibaba.fastjson.JSONObject;
import com.alibaba.fastjson.JSONPObject;
import io.ouka.pay.exception.BaseException;
import org.springframework.util.CollectionUtils;

import java.util.List;

/**
 * @author ouka
 * ValidatorException
 */
public class ValidatorException extends BaseException {
    private List<String> validatorErrMessage;
    public ValidatorException(String errCode, String errMessage) {
        super(errCode, errMessage);
    }

    public ValidatorException(String errCode, String errMessage, List<String> validatorErrMessage) {
        super(errCode, errMessage);
        this.validatorErrMessage = validatorErrMessage;
    }

    @Override
    public String getErrCode() {
        return errCode;
    }

    @Override
    public String getErrMessage() {
        if (CollectionUtils.isEmpty(validatorErrMessage)) {
            return errMessage;
        }else {
            return JSONObject.toJSONString(validatorErrMessage);
        }
    }
}
