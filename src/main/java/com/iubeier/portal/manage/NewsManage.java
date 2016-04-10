package com.iubeier.portal.manage;

import com.iubeier.portal.dao.NewsDao;
import com.iubeier.portal.domain.News;
import com.iubeier.portal.domain.NewsImage;
import com.iubeier.portal.domain.param.NewsPage;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * Created by jankie on 16/1/24.
 */
@Component
public class NewsManage {

    @Autowired
    NewsDao newsDao;

    public News getNewsById(int newsId){
        return newsDao.getNewsById(newsId);
    }

    public List<News> getNewsesByNoteId(NewsPage args){
        return newsDao.getNewsesByNoteId(args);
    }

    public int getNewsesCountByNoteId(int nodeId){
        return newsDao.getNewsesCountByNoteId(nodeId);
    }

    public List<NewsImage> getImagesByNewsId(int newsId){
        return newsDao.getImagesByNewsId(newsId);
    }

    public List<News> getNewsesByAttributeId(NewsPage args){
        return newsDao.getNewsesByAttributeId(args);
    }

    public int getNewsesCountByAttributeId(int attributeId){
        return newsDao.getNewsesCountByAttributeId(attributeId);
    }
}
