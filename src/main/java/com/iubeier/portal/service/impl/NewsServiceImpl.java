package com.iubeier.portal.service.impl;

import com.iubeier.portal.domain.News;
import com.iubeier.portal.mapper.NewsMapper;
import com.iubeier.portal.service.NewsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by jankie on 16/1/23.
 */
@Service
public class NewsServiceImpl implements NewsService {

    @Autowired
    NewsMapper newsMapper;

    public News getNewsById(String newsId){
        return newsMapper.getNewsById(newsId);
    }
}
