package com.deg.mist.apps.persistence.model;

import java.io.Serial;
import java.io.Serializable;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
public class AppBean implements Serializable {

    @Serial
    private static final long serialVersionUID = 1L;

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