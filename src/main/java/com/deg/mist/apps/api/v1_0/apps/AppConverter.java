package com.deg.mist.apps.api.v1_0.apps;

import org.springframework.stereotype.Component;

import com.deg.mist.apps.persistence.model.AppBean;
import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.IOException;

@Component
public class AppConverter {

    ObjectMapper mapper = new ObjectMapper();

    public AppDto toDto(AppBean app) throws JsonParseException, IOException {
        AppDto dto = new AppDto();
        dto.setAppid(app.getAppid());
        dto.setName(app.getName());
        dto.setType(app.getType());
        dto.setReqAge(app.getReqAge());
        dto.setIsFree(app.isFree());
        dto.setShortDescription(app.getShortDescription());
        dto.setWebsite(app.getWebsite());
        dto.setRecommendations(app.getRecommendations());
        dto.setDlc(app.getDlc());
        dto.setDetailedDescription(app.getDetailedDescription());
        dto.setSupportedLanguages(this.mapper.readTree(app.getSupportedLanguages()));
        dto.setPcRequirements(this.mapper.readTree(app.getPcRequirements()));
        dto.setDevelopers(this.mapper.readTree(app.getDevelopers()));
        dto.setPublishers(this.mapper.readTree(app.getPublishers()));
        dto.setPriceOverview(this.mapper.readTree(app.getPriceOverview()));
        dto.setPlatforms(this.mapper.readTree(app.getPlatforms()));
        dto.setCategories(this.mapper.readTree(app.getCategories()));
        dto.setGenres(this.mapper.readTree(app.getGenres()));
        dto.setScreenshots(this.mapper.readTree(app.getScreenshots()));
        dto.setMovies(this.mapper.readTree(app.getMovies()));
        dto.setAchievements(this.mapper.readTree(app.getAchievements()));
        dto.setReleaseDate(this.mapper.readTree(app.getReleaseDate()));
        dto.setSupportInfo(this.mapper.readTree(app.getSupportInfo()));
        return dto;
    }

    public AppBean toBean(AppDto dto) {
        return new AppBean(
                dto.getAppid(),
                dto.getName(),
                dto.getType(),
                dto.getReqAge(),
                dto.getIsFree(),
                dto.getShortDescription(),
                dto.getWebsite(),
                dto.getRecommendations(),
                dto.getDlc(),
                dto.getDetailedDescription(),
                dto.getSupportedLanguages().toString(),
                dto.getPcRequirements().toString(),
                dto.getDevelopers().toString(),
                dto.getPublishers().toString(),
                dto.getPriceOverview().toString(),
                dto.getPlatforms().toString(),
                dto.getCategories().toString(),
                dto.getGenres().toString(),
                dto.getScreenshots().toString(),
                dto.getMovies().toString(),
                dto.getAchievements().toString(),
                dto.getReleaseDate().toString(),
                dto.getSupportInfo().toString());
    }
}
