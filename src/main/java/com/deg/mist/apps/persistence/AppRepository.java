package com.deg.mist.apps.persistence;

import com.deg.mist.apps.persistence.model.AppBean;

public interface AppRepository {

    AppBean getAppById(Long appid);
    
}
