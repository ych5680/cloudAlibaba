package com.ych.myhandler;

import com.alibaba.csp.sentinel.slots.block.BlockException;
import com.ych.springcloud.entities.CommonResult;

/**
 * @description:
 * @author: chengHang
 * @version: 1.0
 * @create: 2020-09-23 15:24
 **/
public class CustomerBlockHandler {
    //必须static + BlockException
    public static CommonResult handleException(BlockException exception) {
        return new CommonResult(2020, "自定义限流处理信息....CustomerBlockHandler");
    }
    public static CommonResult handlerException2(BlockException exception) {
        return new CommonResult(2020, "自定义限流处理信息....CustomerBlockHandler2");
    }
}
