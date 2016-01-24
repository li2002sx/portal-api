package com.iubeier.portal.domain;

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

    private String summary;

    private Date publishDate;

}
