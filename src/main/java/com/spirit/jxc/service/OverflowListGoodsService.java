package com.spirit.jxc.service;

import com.spirit.jxc.domain.ServiceVO;
import com.spirit.jxc.entity.OverflowList;

import java.util.Map;

/**
 * @description
 */
public interface OverflowListGoodsService {

    ServiceVO save(OverflowList overflowList, String overflowListGoodsStr);

    Map<String,Object> list(String sTime, String eTime);

    Map<String,Object> goodsList(Integer overflowListId);
}
