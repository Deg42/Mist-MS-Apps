package com.deg.mist.apps.persistence.mapper;

import com.deg.mist.apps.persistence.model.AppBean;

public interface AppMapper {
    int deleteByPrimaryKey(Long appid);

    int insert(AppBean record);

    int insertSelective(AppBean record);

    AppBean selectByPrimaryKey(Long appid);

    int updateByPrimaryKeySelective(AppBean record);

    int updateByPrimaryKeyWithBLOBs(AppBean record);

    int updateByPrimaryKey(AppBean record);
}