package com.iubeier.portal.controller;

import com.iubeier.portal.domain.News;
import com.iubeier.portal.service.NewsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Created by jankie on 16/1/23.
 */
@Controller
public class NewsController {

    @Autowired
    NewsService newsService;

    @RequestMapping("/news/{id}")
    @ResponseBody
    public News getNewsById(@PathVariable(value = "id") String newsId){

        News news = newsService.getNewsById(newsId);
        if (news ==null){
            news = new News();
            news.setTitle("1111");
        }
        return news;
    }
}
