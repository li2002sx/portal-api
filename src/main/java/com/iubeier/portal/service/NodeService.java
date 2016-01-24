package com.iubeier.portal.service;

import com.iubeier.portal.domain.Node;

import java.util.List;

/**
 * Created by jankie on 16/1/23.
 */
public interface NodeService {

    List<Node> getNodesByParentId(int parentId);
}
