package com.example.feignclient.service.impl;

import com.example.feignclient.base.BaseErrorInterfaceInfo;
import com.example.feignclient.base.BaseRspEntity;
import com.example.feignclient.service.LoanClient;
import org.springframework.stereotype.Component;

@Component
public class LoanClientHystrix implements LoanClient{
    @Override
    public Object findOne(long id) {
        BaseRspEntity baseRspEntity = new BaseRspEntity(BaseErrorInterfaceInfo.SERVER_ERROR);
        baseRspEntity.setResult("can not find loan, id = " + id);
        return baseRspEntity;
    }

    @Override
    public Object findList(int page, int size, long loanLimit) {
        BaseRspEntity baseRspEntity = new BaseRspEntity(BaseErrorInterfaceInfo.SERVER_ERROR);
        baseRspEntity.setResult("no loan find where page = " + page + "size = " + size + "loanLimit = " + loanLimit);
        return baseRspEntity;
    }
}
