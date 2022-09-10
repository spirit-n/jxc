package com.spirit.jxc.service;

import com.spirit.jxc.domain.ServiceVO;

/**
 * @description
 */
public interface GoodsTypeService {

    ServiceVO delete(Integer goodsTypeId);

    ServiceVO save(String goodsTypeName,Integer pId);

    String loadGoodsType();
}
