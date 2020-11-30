package io.ouka.pay.common.result;

import java.io.Serializable;

/**
 * @author ouka
 * AbstractResponse
 */
public abstract class AbstractResponse implements Serializable {
    private static final long serialVersionUID = 2678854070412422501L;

    private String code;
    private String msg;
    private Object details;

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public Object getDetails() {
        return details;
    }

    public void setDetails(Object details) {
        this.details = details;
    }

    @Override
    public String toString() {
        return "AbstractResponse{" +
                "code='" + code + '\'' +
                ", msg='" + msg + '\'' +
                ", details=" + details +
                '}';
    }
}
