package com.iubeier.portal.dao;

import com.iubeier.portal.domain.Node;
import com.iubeier.portal.mapper.NodeMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created by jankie on 16/1/24.
 */
@Repository
public class NodeDao {
    @Autowired
    NodeMapper nodeMapper;

    public List<Node> getNodesByParentId(int parentId){

        return nodeMapper.getNodesByParentId(parentId);
    }
}
