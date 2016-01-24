package com.iubeier.portal.domain.comm;


import lombok.Getter;
import lombok.Setter;
import java.util.List;

/**
 * Created by jankie on 16/1/24.
 */
@Getter
@Setter
public class DataList<T> {
    private List<T> items;
    private int totalCount;
}
