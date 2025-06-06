package com.jaodev.dslist.dto;

import com.jaodev.dslist.entities.Game;
import com.jaodev.dslist.projections.GameMinProjection;

public class GameMinDTO {
    private Long id;
    private String title;
    private Integer year;
    private String imgUrl;
    private String shortDescription;

    public GameMinDTO() {}


    public GameMinDTO(Game entity) {
        shortDescription = entity.getShortDescription();
        imgUrl = entity.getImgUrl();
        year = entity.getYear();
        id = entity.getId();
        title = entity.getTitle();
    }

    public GameMinDTO(GameMinProjection projection) {
        shortDescription = projection.getShortDescription();
        imgUrl = projection.getImgUrl();
        year = projection.getGameYear();
        id = projection.getId();
        title = projection.getTitle();
    }

    public Long getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public Integer getYear() {
        return year;
    }

    public String getImgUrl() {
        return imgUrl;
    }

    public String getShortDescription() {
        return shortDescription;
    }
}
