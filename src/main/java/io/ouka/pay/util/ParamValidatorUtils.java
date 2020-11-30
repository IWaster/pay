package io.ouka.pay.util;

import io.ouka.pay.exception.validator.ValidatorException;

import javax.validation.ConstraintViolation;
import javax.validation.Validation;
import javax.validation.Validator;
import javax.validation.groups.Default;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

/**
 * @author ouka
 * ParamValidatorUtils
 */
public final class ParamValidatorUtils {

    private ParamValidatorUtils(){}
    private static final Validator validator = Validation.buildDefaultValidatorFactory().getValidator();


    /**
     * 校验实体参数,返回所有错误信息
     * @param t
     * @param <T>
     * @return
     */
    private static <T> List<String> validate(T t) {
        List<String> wrongMsgList = new ArrayList<>();
        Set<ConstraintViolation<T>> validationSet = validator.validate(t, Default.class);
        if (validationSet != null && validationSet.size() > 0) {
            Iterator<ConstraintViolation<T>> iterator = validationSet.iterator();
            while (iterator.hasNext()){
                ConstraintViolation<T> result = iterator.next();
                wrongMsgList.add(result.getMessage());
            }
        }
        return wrongMsgList;
    }

    public static<T> void validateParam(T t){
        List<String> validate = validate(t);
        if (validate.size()>0) {
            /*这块抛异常*/
            throw new ValidatorException("70000","参数错误",validate);
        }
    }

}
