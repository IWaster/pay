package io.ouka.pay.exception;

/**
 * @author ouka
 * IExceptionMessage
 */
public interface IExceptionMessage {
    /**
     * 异常编码
     * @return 异常码
     */
    public String  getErrCode();

    /**
     * 异常信息
     * @return 异常信息
     */
    public String  getErrMessage();

}
