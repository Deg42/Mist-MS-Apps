package com.deg.mist.apps.api.v1_0.apps;

import lombok.Data;

import com.fasterxml.jackson.databind.JsonNode;

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

    private JsonNode  supportedLanguages;

    private JsonNode  pcRequirements;

    private JsonNode developers;

    private JsonNode publishers;

    private JsonNode priceOverview;

    private JsonNode platforms;

    private JsonNode categories;

    private JsonNode genres;

    private JsonNode screenshots;

    private JsonNode movies;

    private JsonNode achievements;

    private JsonNode releaseDate;

    private JsonNode supportInfo;
    
}
