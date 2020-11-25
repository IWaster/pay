package io.ouka.pay.common.result;

import java.io.Serializable;

/**
 * @author ouka
 * @ClassName AbstractRequest
 * @Package io.ouka.pay.common.result
 * @Description: TODO
 * @date 2020/11/25 10:56
 */
public abstract class AbstractRequest implements Serializable {

    private static final long serialVersionUID = -6266061609066754124L;
    public abstract void requestCheck();

    @Override
    public String toString() {
        return "AbstractRequest{}";
    }
}
