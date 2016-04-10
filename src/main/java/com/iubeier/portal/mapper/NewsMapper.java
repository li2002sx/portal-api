package com.iubeier.portal.mapper;

import com.iubeier.portal.domain.News;
import com.iubeier.portal.domain.param.NewsPage;

import java.util.List;

/**
 * Created by jankie on 16/1/23.
 */
public interface NewsMapper {

    News getNewsById(int newsId);

    List<News> getNewsesByNoteId(NewsPage args);

    int getNewsesCountByNoteId(int nodeId);

    List<News> getNewsesByAttributeId(NewsPage args);

    int getNewsesCountByAttributeId(int attributeId);

}
