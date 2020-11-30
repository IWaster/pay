package io.ouka.pay.common.utils;

import io.ouka.pay.common.result.AbstractResponse;
import io.ouka.pay.exception.BaseException;

/**
 * @author ouka
 * ExceptionProcessorUtils
 */
public class ExceptionProcessorUtils {
    public static void wrapperHandlerException(AbstractResponse response, Exception e){
        try {
            ExceptionUtil.handlerException4biz(response,e);
        } catch (Exception ex) {
            /*处理不了的*/
            response.setCode("5000");
            response.setMsg("错误");
        }

    }

    public static class ExceptionUtil{
        public static AbstractResponse handlerException4biz(AbstractResponse response,Exception e) throws Exception {
            if (e instanceof BaseException){
                response.setCode(((BaseException) e).getErrCode());
                response.setMsg(((BaseException) e).getErrMessage());
                response.setDetails(((BaseException) e).getDetails());
            }else {
                throw new Exception(e);
            }

            return response;
        }
    }

}
