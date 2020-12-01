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
 * BasePayment
 */
public abstract class BasePayment implements IPayment {
    private static Map<String, BasePayment> paymentMap = new ConcurrentHashMap<String, BasePayment>();

    public static  BasePayment getPayment(String payChannel){
        return paymentMap.get(payChannel);
    }

    @PostConstruct
    public void init() {
        paymentMap.put(getPayChannel(), this);
    }

    /**
     * 获取取到
     * @return 渠道
     */
    public abstract String getPayChannel();


    /**
     * 获取验证器
     *
     * @return 验证器
     */
    public abstract Validator getValidator();


    /**
     * 创建上下文信息
     *
     * @param request 请求体
     * @return 上下文
     */
    public abstract Context createContext(AbstractRequest request);


    /**
     * 为下层的支付渠道的数据做好准备
     *
     * @param request 请求体
     * @param context 上下文
     */
    public  void prepare(AbstractRequest request, Context context){
        SortedMap<String, Object> sParaTemp = new TreeMap<String, Object>();
        context.setsParaTemp(sParaTemp);
    };



    /**
     * 基本业务处理
     *
     * @param request 请求体
     * @param context 上下文
     * @return AbstractResponse 基本业务响应体
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
