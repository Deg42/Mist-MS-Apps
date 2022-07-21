package com.deg.mist.apps.persistence.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.deg.mist.apps.persistence.AppRepository;
import com.deg.mist.apps.persistence.mapper.AppMapper;
import com.deg.mist.apps.persistence.model.AppBean;

import lombok.extern.slf4j.Slf4j;


@Slf4j
@Repository
public class AppRepositoryImpl implements AppRepository {

    private final AppMapper appMapper;

    @Autowired
    public AppRepositoryImpl(AppMapper appMapper) {
        super();
        this.appMapper = appMapper;
    }

    @Override
    public AppBean getAppById(Long appid) {
        log.info("Repo: Getting app by id: " + appid);
        final AppBean result = this.appMapper.selectByPrimaryKey(appid);
        log.info("Repo: App obtained: " + result.getName());
        return result;
    }

}
    
