package com.spirit.jxc.service;

import com.spirit.jxc.domain.ServiceVO;
import com.spirit.jxc.entity.DamageList;

import java.util.Map;

/**
 * @description
 */
public interface DamageListGoodsService {

    ServiceVO save(DamageList damageList, String damageListGoodsStr);

    Map<String,Object> list(String sTime, String eTime);

    Map<String,Object> goodsList(Integer damageListId);
}
