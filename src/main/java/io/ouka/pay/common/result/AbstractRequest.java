package io.ouka.pay.common.result;

import java.io.Serializable;

/**
 * @author ouka
 * AbstractRequest
 */
public abstract class AbstractRequest implements Serializable {

    private static final long serialVersionUID = -6266061609066754124L;
    public abstract void requestCheck();

    @Override
    public String toString() {
        return "AbstractRequest{}";
    }
}
