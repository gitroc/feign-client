package com.example.feignclient;

import com.example.feignclient.base.BaseErrorInterfaceInfo;
import com.example.feignclient.base.BaseRspEntity;
import org.springframework.stereotype.Component;

@Component
public class CompanyClientHystrix implements CompanyClient {
    @Override
    public Object findAll() {
        return new BaseRspEntity(BaseErrorInterfaceInfo.SERVER_ERROR);
    }
}
