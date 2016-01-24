package com.iubeier.portal.service.impl;

import com.iubeier.portal.domain.News;
import com.iubeier.portal.domain.NewsPage;
import com.iubeier.portal.manage.NewsManage;
import com.iubeier.portal.service.NewsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by jankie on 16/1/23.
 */
@Service
public class NewsServiceImpl implements NewsService {

    @Autowired
    NewsManage newsManage;

    public News getNewsById(int newsId){
        return newsManage.getNewsById(newsId);
    }

    public List<News> getNewsesByNoteId(NewsPage args){
        return newsManage.getNewsesByNoteId(args);
    }

    public int getNewsesCountByNoteId(int nodeId){
        return newsManage.getNewsesCountByNoteId(nodeId);
    }
}
