package com.deg.mist.apps.api.v1_0.apps;

import lombok.Data;

@Data
public class AppDto {

    private Long appid;

    private String name;

    private Long type;

    private Integer reqAge;

    private Boolean isFree;

    private String shortDescription;

    private String website;

    private Integer recommendations;

    private String dlc;

    private String detailedDescription;

    private String supportedLanguages;

    private String pcRequirements;

    private String developers;

    private String publishers;

    private String priceOverview;

    private String platforms;

    private String categories;

    private String genres;

    private String screenshots;

    private String movies;

    private String achievements;

    private String releaseDate;

    private String supportInfo;
    
}
