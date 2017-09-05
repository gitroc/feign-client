package com.example.feignclient.service.impl;

import com.example.feignclient.base.BaseErrorInterfaceInfo;
import com.example.feignclient.base.BaseRspEntity;
import com.example.feignclient.service.CompanyClient;
import org.springframework.stereotype.Component;

@Component
public class CompanyClientHystrix implements CompanyClient {
    @Override
    public Object findOne(int id) {
        BaseRspEntity baseRspEntity = new BaseRspEntity(BaseErrorInterfaceInfo.SERVER_ERROR);
        baseRspEntity.setResult("can not find company, id = " + id);
        return baseRspEntity;
    }

    @Override
    public Object findList(int page, int size, String updateTime) {
        BaseRspEntity baseRspEntity = new BaseRspEntity(BaseErrorInterfaceInfo.SERVER_ERROR);
        baseRspEntity.setResult("no company find where page = " + page + "size = " + size + "updateTime = " + updateTime);
        return baseRspEntity;
    }
}
