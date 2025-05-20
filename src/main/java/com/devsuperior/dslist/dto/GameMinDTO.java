package com.devsuperior.dslist.dto;

import com.devsuperior.dslist.Game;

public class GameMinDTO {

    private long id;
    private String title;
    private Integer year;
    private String imUrl;
    private String shortDescription;

    public GameMinDTO() {
    }
    public GameMinDTO(Game entity) {
        id = entity.getId();
        title = entity.getTitle();
        year = entity.getYear();
        imUrl = entity.getImUrl();
        shortDescription = entity.getShortDescription();
    }

    public long getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public Integer getYear() {
        return year;
    }

    public String getImUrl() {
        return imUrl;
    }

    public String getShortDescription() {
        return shortDescription;
    }
}
