package com.iubeier.portal.manage;

import com.iubeier.portal.dao.NodeDao;
import com.iubeier.portal.domain.Node;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * Created by jankie on 16/1/24.
 */
@Component
public class NodeManage {

    @Autowired
    NodeDao nodeDao;

    public List<Node> getNodesByParentId(int parentId){
        return nodeDao.getNodesByParentId(parentId);
    }
}
