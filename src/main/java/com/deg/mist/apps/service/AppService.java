package com.deg.mist.apps.service;

import com.deg.mist.apps.api.v1_0.apps.AppDto;

public interface AppService {

    AppDto getAppById(Long appid);
    
}
