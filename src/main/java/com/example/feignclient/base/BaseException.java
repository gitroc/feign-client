package com.example.feignclient.base;

public class BaseException extends Exception {
    BaseErrorInterface errorInfo;

    public BaseException(BaseErrorInterface errorInfo) {
        this.errorInfo = errorInfo;
    }

    public BaseErrorInterface getErrorInfo() {
        return errorInfo;
    }

    public void setErrorInfo(BaseErrorInterface errorInfo) {
        this.errorInfo = errorInfo;
    }
}
