package io.ouka.pay.common.utils;

import io.ouka.pay.common.result.AbstractResponse;

/**
 * @author ouka
 * ExceptionProcessorUtils
 */
public class ExceptionProcessorUtils {
    public static void wrapperHandlerException(AbstractResponse response, Exception e){
        try {
            ExceptionUtil.handlerException4biz(response,e);
        } catch (Exception ex) {
            response.setCode("5000");
            response.setMsg("错误");
        }
    }

    public static class ExceptionUtil{
        public static AbstractResponse handlerException4biz(AbstractResponse response,Exception e) throws Exception {
/*            if (e instanceof xxxxxException){
                response.setCode("xxxxException Code");
                response.setMsg("xxxxException Msg");
            }*/
            return response;
        }
    }
}
