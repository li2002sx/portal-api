package com.iubeier.portal.domain.param;

import com.iubeier.portal.domain.comm.Page;
import lombok.Getter;
import lombok.Setter;

/**
 * Created by jankie on 16/1/24.
 */
@Getter
@Setter
public class NewsPage extends Page {

    //按照栏目查询
    private int nodeId;

    //按照属性查询
    private int attributeId;
}
