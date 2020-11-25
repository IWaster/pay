package io.ouka.pay.biz.abs;

import io.ouka.pay.common.result.AbstractRequest;
import io.ouka.pay.common.result.AbstractResponse;

import javax.annotation.PostConstruct;
import java.util.Map;
import java.util.SortedMap;
import java.util.TreeMap;
import java.util.concurrent.ConcurrentHashMap;

/**
 * @author ouka
 * @ClassName BasePayment
 * @Package io.ouka.pay.biz.abs
 * @Description: TODO
 * @date 2020/11/25 13:39
 */
public abstract class BasePayment implements IPayment {
    public static Map<String, BasePayment> paymentMap = new ConcurrentHashMap<String, BasePayment>();

    @PostConstruct
    public void init() {
        paymentMap.put(getPayChannel(), this);
    }

    public abstract String getPayChannel();


    /**
     * 获取验证器
     *
     * @return
     */
    public abstract Validator getValidator();


    /**
     * 创建上下文信息
     *
     * @param request
     * @return
     */
    public abstract Context createContext(AbstractRequest request);


    /**
     * 为下层的支付渠道的数据做好准备
     *
     * @param request
     * @param context
     */
    public  void prepare(AbstractRequest request, Context context){
        SortedMap<String, Object> sParaTemp = new TreeMap<String, Object>();
        context.setsParaTemp(sParaTemp);
    };



    /**
     * 基本业务处理
     *
     * @param request
     * @param context
     * @return AbstractResponse
     */
    public abstract AbstractResponse generalProcess(AbstractRequest request, Context context) ;


    /***
     * 基本业务处理完成后执行的后续操作
     * @param request
     * @param respond
     * @param context
     * @return
     */
    public abstract void afterProcess(AbstractRequest request, AbstractResponse respond,Context context) ;

    /**
     * 核心处理器
     */
    @Override
    public <T extends AbstractResponse> T process(AbstractRequest request) {
        AbstractResponse response = null;
        //创建上下文
        Context context = createContext(request);
        //验证
        getValidator().validate(request);
        //准备
        prepare(request, context);
        //执行
        response = generalProcess(request, context);
        //善后
        afterProcess(request, response, context);
        return (T) response;
    }


}
