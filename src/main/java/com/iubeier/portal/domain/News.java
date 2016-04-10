package com.iubeier.portal.domain;

import com.iubeier.portal.domain.comm.Result;
import lombok.Getter;
import lombok.Setter;

import java.util.Date;


/**
 * Created by jankie on 16/1/23.
 */
@Getter
@Setter
public class News {

    private int newsId;

    private String title;

    private String link;

    private String fullTitle;

    private String author;

    private String summary;

    private Date publishDate;

    private String smallImage;

    private String largeImage;

    private String video;

    private String file;

    private String image;

    private int model;
}
