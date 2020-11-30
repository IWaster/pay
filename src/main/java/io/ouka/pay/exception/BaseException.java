package io.ouka.pay.exception;

/**
 * @author ouka
 * BaseException
 */
public abstract class BaseException extends RuntimeException implements IExceptionMessage{
    protected String errCode;
    protected String errMessage;
    protected Object errDetails;

    public BaseException(String errCode, String errMessage) {
        super();
        this.errCode = errCode;
        this.errMessage = errMessage;
    }

    public BaseException(String errCode, String errMessage, Object errDetails) {
        this.errCode = errCode;
        this.errMessage = errMessage;
        this.errDetails = errDetails;
    }

    public BaseException() {
        super();
    }

    public BaseException(String message) {
        super(message);
    }

    public BaseException(String message, Throwable cause) {
        super(message, cause);
    }

    public BaseException(Throwable cause) {
        super(cause);
    }

    protected BaseException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
