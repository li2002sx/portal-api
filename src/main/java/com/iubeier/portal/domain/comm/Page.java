package com.iubeier.portal.domain.comm;


import lombok.Getter;
import lombok.Setter;

/**
 * Created by jankie on 16/1/24.
 */
@Getter
@Setter
public abstract class Page {

    private int itemStart;

    private int pageSize;
}
