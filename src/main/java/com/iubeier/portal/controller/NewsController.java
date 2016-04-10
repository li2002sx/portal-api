package com.iubeier.portal.controller;

import com.iubeier.portal.domain.News;
import com.iubeier.portal.domain.NewsImage;
import com.iubeier.portal.domain.param.NewsPage;
import com.iubeier.portal.domain.comm.DataList;
import com.iubeier.portal.manage.NewsConvert;
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

    @RequestMapping("/newslist/{id}/{pi}")
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

    @RequestMapping("/newsimage/{id}")
    public List<NewsImage> getImagesByNewsId(@PathVariable(value = "id") int newsId){
        return newsService.getImagesByNewsId(newsId);
    }

    @RequestMapping("/firstnewslist/{id}/{pi}")
    public DataList<News> getNewsesByAttributeId(@PathVariable(value = "id") int attributeId
            ,@PathVariable(value = "pi") int pageIndex){

        DataList<News> newsList = new DataList<News>();
        try {
            int pageSize = 20;

            NewsPage newsPage = new NewsPage();
            newsPage.setAttributeId(attributeId);
            newsPage.setItemStart((pageIndex - 1) * pageSize);
            newsPage.setPageSize(pageSize);

            List<News> newses = newsService.getNewsesByAttributeId(newsPage);
            newses = NewsConvert.NewsListConvert(newses);
            int totalCount = newsService.getNewsesCountByAttributeId(attributeId);


            newsList.setItems(newses);
            newsList.setTotalCount(totalCount);
            newsList.setStatus(1);
        }catch (RuntimeException ex){
            newsList.setStatus(0);
            newsList.setMessage(ex.getMessage());
        }
        return newsList;
    }
}
