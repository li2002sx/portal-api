package com.iubeier.portal.service;

import com.iubeier.portal.domain.News;
import com.iubeier.portal.domain.NewsPage;

import java.util.List;

/**
 * Created by jankie on 16/1/23.
 */
public interface NewsService {

    News getNewsById(int newsId);

    List<News> getNewsesByNoteId(NewsPage args);

    int getNewsesCountByNoteId(int nodeId);
}
