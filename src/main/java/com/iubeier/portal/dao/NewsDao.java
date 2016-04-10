package com.iubeier.portal.dao;

import com.iubeier.portal.domain.News;
import com.iubeier.portal.domain.NewsImage;
import com.iubeier.portal.domain.param.NewsPage;
import com.iubeier.portal.mapper.NewsImageMapper;
import com.iubeier.portal.mapper.NewsMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created by jankie on 16/1/24.
 */
@Repository
public class NewsDao {
    @Autowired
    NewsMapper newsMapper;

    @Autowired
    NewsImageMapper newsImageMapper;

    public News getNewsById(int newsId){
        return newsMapper.getNewsById(newsId);
    }

    public List<News> getNewsesByNoteId(NewsPage args){
        return newsMapper.getNewsesByNoteId(args);
    }

    public int getNewsesCountByNoteId(int nodeId){
        return newsMapper.getNewsesCountByNoteId(nodeId);
    }

    public List<NewsImage> getImagesByNewsId(int newsId){
        return  newsImageMapper.getImagesByNewsId(newsId);
    }

    public List<News> getNewsesByAttributeId(NewsPage args){
        return newsMapper.getNewsesByAttributeId(args);
    }

    public int getNewsesCountByAttributeId(int attributeId){
        return newsMapper.getNewsesCountByAttributeId(attributeId);
    }
}
