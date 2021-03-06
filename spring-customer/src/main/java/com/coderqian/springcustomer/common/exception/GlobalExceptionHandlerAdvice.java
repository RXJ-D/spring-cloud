package com.coderqian.springcustomer.common.exception;

import com.coderqian.springcustomer.common.BaseResult;
import com.coderqian.springcustomer.util.LogUtils;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestControllerAdvice;


/**
 * @author qianliqing
 * @date 2018-09-28 下午9:03
 * mail: qianlq0824@gmail.com
 * <p>
 * 全局异常捕获
 */

@RestControllerAdvice
public class GlobalExceptionHandlerAdvice {

    @ExceptionHandler(BusinessException.class)
    @ResponseBody
    public BaseResult handleBusinessException(BusinessException be) {
        LogUtils.error(be);
        be.printStackTrace();
        return be.getBaseResult();
    }
}
