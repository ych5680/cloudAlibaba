package com.ych.service;

import com.ych.springcloud.entities.CommonResult;
import com.ych.springcloud.entities.Payment;
import org.springframework.stereotype.Service;

/**
 * @description:
 * @author: chengHang
 * @version: 1.0
 * @create: 2020-09-30 15:27
 **/
@Service
public class PaymentFallbackService implements PaymentService {
    @Override
    public CommonResult<Payment> paymentSQL(Long id) {
        return new CommonResult<>(44444,"服务降级返回,---PaymentFallbackService",new Payment(id,"errorSerial"));    }
}
