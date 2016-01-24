package com.iubeier.portal.mapper;

import com.iubeier.portal.domain.News;
import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * Created by jankie on 16/1/23.
 */
public interface NewsMapper {

    News getNewsById(String newsId);

}
