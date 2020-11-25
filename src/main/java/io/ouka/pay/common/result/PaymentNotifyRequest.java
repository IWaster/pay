package io.ouka.pay.common.result;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotBlank;

/**
 * @author ouka
 * @ClassName PaymentNotifyRequest
 * @Package io.ouka.pay.common.result
 * @Description: TODO
 * @date 2020/11/25 11:25
 */
public class PaymentNotifyRequest extends AbstractRequest{
    private static final long serialVersionUID = 4800404140904865450L;
    @NotBlank(message = "a参数为空")
    public String a;
    @Min(value = 0,message = "b过小")
    @Max(value = 10,message = "b过大")
    public int b;

    @Override
    public void requestCheck() {

    }
}
