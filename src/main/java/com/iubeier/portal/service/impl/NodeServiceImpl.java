package com.iubeier.portal.service.impl;

import com.iubeier.portal.domain.Node;
import com.iubeier.portal.manage.NodeManage;
import com.iubeier.portal.service.NodeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by jankie on 16/1/23.
 */
@Service
public class NodeServiceImpl implements NodeService {

    @Autowired
    NodeManage nodeManage;

    public List<Node> getNodesByParentId(int parentId) {
        return nodeManage.getNodesByParentId(parentId);
    }
}
