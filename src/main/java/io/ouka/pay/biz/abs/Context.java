package io.ouka.pay.biz.abs;

import java.util.SortedMap;

/**
 * @author ouka
 * Context
 */
public class Context {

    public Context() {
        super();
    }

    SortedMap<String, Object> sParaTemp;

    public SortedMap<String, Object> getsParaTemp() {
        return sParaTemp;
    }

    public void setsParaTemp(SortedMap<String, Object> sParaTemp) {
        this.sParaTemp = sParaTemp;
    }
}
