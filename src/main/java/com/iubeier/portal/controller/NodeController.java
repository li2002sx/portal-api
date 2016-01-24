package com.iubeier.portal.controller;

import com.iubeier.portal.domain.Node;
import com.iubeier.portal.service.NodeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * Created by jankie on 16/1/24.
 */
@RestController
public class NodeController {

    @Autowired
    NodeService nodeService;

    @RequestMapping("/nodes/{id}")
    public List<Node> getNodesByParentId(@PathVariable(value = "id") int parentId){
        return  nodeService.getNodesByParentId(parentId);
    }
}
