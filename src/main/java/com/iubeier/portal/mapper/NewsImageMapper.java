package com.iubeier.portal.mapper;

import com.iubeier.portal.domain.News;
import com.iubeier.portal.domain.NewsImage;
import com.iubeier.portal.domain.param.NewsPage;

import java.util.List;

/**
 * Created by jankie on 16/1/23.
 */
public interface NewsImageMapper {

    List<NewsImage> getImagesByNewsId(int newsId);

}
