package com.example.feignclient.base;

import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import javax.servlet.http.HttpServletRequest;

@RestControllerAdvice
public class BaseErrorHandler {
    @ExceptionHandler(value = BaseException.class)
    public BaseRspEntity errorHandlerOverJson(HttpServletRequest request,
                                              BaseException exception) {
        BaseErrorInterface errorInfo = exception.getErrorInfo();
        BaseRspEntity result = new BaseRspEntity(errorInfo);
        return result;
    }
}
