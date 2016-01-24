package com.iubeier.portal.service;

import com.iubeier.portal.domain.News;

/**
 * Created by jankie on 16/1/23.
 */
public interface NewsService {

    News getNewsById(String newsId);
}
