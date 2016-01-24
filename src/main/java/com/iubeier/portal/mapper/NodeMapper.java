package com.iubeier.portal.mapper;

import com.iubeier.portal.domain.Node;

import java.util.List;

/**
 * Created by jankie on 16/1/23.
 */
public interface NodeMapper {

    List<Node> getNodesByParentId(int parentId);

}
