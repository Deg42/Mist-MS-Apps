package com.deg.mist.apps.api.v1_0.apps;

import org.springframework.stereotype.Component;

import com.deg.mist.apps.persistence.model.AppBean;

@Component
public class AppConverter {

        public AppDto toDto(AppBean app) {
        AppDto dto = new AppDto();
        dto.setAppid(app.getAppid());
        dto.setName(app.getName());
        dto.setType(app.getType());
        dto.setReqAge(app.getReqAge()); 
        dto.setIsFree(app.getIsFree());
        dto.setShortDescription(app.getShortDescription());
        dto.setWebsite(app.getWebsite());
        dto.setRecommendations(app.getRecommendations());
        dto.setDlc(app.getDlc());
        dto.setDetailedDescription(app.getDetailedDescription());
        dto.setSupportedLanguages(app.getSupportedLanguages());
        dto.setPcRequirements(app.getPcRequirements());
        dto.setDevelopers(app.getDevelopers());
        dto.setPublishers(app.getPublishers());
        dto.setPriceOverview(app.getPriceOverview());
        dto.setPlatforms(app.getPlatforms());
        dto.setCategories(app.getCategories());
        dto.setGenres(app.getGenres());
        dto.setScreenshots(app.getScreenshots());
        dto.setMovies(app.getMovies());
        dto.setAchievements(app.getAchievements());
        dto.setReleaseDate(app.getReleaseDate());
        dto.setSupportInfo(app.getSupportInfo());
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
                dto.getSupportedLanguages(),
                dto.getPcRequirements(),
                dto.getDevelopers(),
                dto.getPublishers(),
                dto.getPriceOverview(),
                dto.getPlatforms(),
                dto.getCategories(),
                dto.getGenres(),
                dto.getScreenshots(),
                dto.getMovies(),
                dto.getAchievements(),
                dto.getReleaseDate(),
                dto.getSupportInfo()
        );
    }
}
