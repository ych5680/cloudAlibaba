package com.ych.controller;

import com.ych.service.PaymentService;
import com.ych.springcloud.entities.CommonResult;
import com.ych.springcloud.entities.Payment;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * @description:
 * @author: chengHang
 * @version: 1.0
 * @create: 2020-09-30 15:34
 **/
@RestController
public class PaymentSQL {
    // OpenFeign
    @Resource
    private PaymentService paymentService;

    @GetMapping(value = "/consumer/paymentSQL/{id}")
    public CommonResult<Payment> paymentSQL(@PathVariable("id") Long id) {
        return paymentService.paymentSQL(id);
    }


}
