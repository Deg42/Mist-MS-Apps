package com.deg.mist.apps.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.deg.mist.apps.api.v1_0.apps.AppConverter;
import com.deg.mist.apps.api.v1_0.apps.AppDto;
import com.deg.mist.apps.persistence.AppRepository;
import com.deg.mist.apps.service.AppService;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@Service
public class AppServiceImpl implements AppService {

    private final AppRepository appRepository;

    private final AppConverter appConverter;

    @Autowired
    public AppServiceImpl(AppRepository appRepository, AppConverter appConverter) {
        super();
        this.appRepository = appRepository;
        this.appConverter = appConverter;
    }

    @Override
    public AppDto getAppById(Long appid) {
        log.info("Service: Getting app by id: " + appid);
        AppDto result = new AppDto();
        try {
            result = appConverter.toDto(this.appRepository.getAppById(appid));
            log.info("Service: App obtained: " + result.getName());
        } catch (Exception e) {
            log.error("Service: Error getting app by id: " + appid);
        }
        return result;
    }

}
