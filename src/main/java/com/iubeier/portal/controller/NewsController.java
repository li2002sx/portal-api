package com.iubeier.portal.controller;

import com.iubeier.portal.domain.News;
import com.iubeier.portal.domain.NewsPage;
import com.iubeier.portal.domain.comm.DataList;
import com.iubeier.portal.service.NewsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * Created by jankie on 16/1/23.
 */
@RestController
public class NewsController {

    @Autowired
    NewsService newsService;

    @RequestMapping("/news/{id}")
    public News getNewsById(@PathVariable(value = "id") int newsId){

        News news = newsService.getNewsById(newsId);
        return news;
    }

    @RequestMapping("/newses/{id}/{pi}")
    public DataList<News> getNewsesByNoteId(@PathVariable(value = "id") int nodeId
            ,@PathVariable(value = "pi") int pageIndex){

        int pageSize = 20;

        NewsPage newsPage = new NewsPage();
        newsPage.setNodeId(nodeId);
        newsPage.setItemStart((pageIndex - 1) * pageSize);
        newsPage.setPageSize(pageSize);

        List<News> newses = newsService.getNewsesByNoteId(newsPage);
        int totalCount = newsService.getNewsesCountByNoteId(nodeId);

        DataList<News> newsList = new DataList<News>();
        newsList.setItems(newses);
        newsList.setTotalCount(totalCount);
        return newsList;
    }
}
