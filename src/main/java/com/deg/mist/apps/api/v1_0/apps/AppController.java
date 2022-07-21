package com.deg.mist.apps.api.v1_0.apps;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.deg.mist.apps.service.AppService;

import lombok.extern.slf4j.Slf4j;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Slf4j
@RestController
@RequestMapping(path = "/v1_0/apps", produces = MediaType.APPLICATION_JSON_VALUE)
public class AppController {

    private final AppService appService;

    @Autowired
    public AppController(AppService appService) {
        super();
        this.appService = appService;
    }

    @GetMapping(value="/")
    public @ResponseBody AppDto getAppById(@RequestParam Long appid) {
        log.info("ID: " + appid);
        final AppDto result = this.appService.getAppById(appid);
        log.info("Result: " + result.getName());
        return result;
    }
        
}
