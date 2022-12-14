package com.spirit.jxc.service;

import com.spirit.jxc.domain.ServiceVO;
import com.spirit.jxc.entity.ReturnList;

import java.util.Map;

/**
 * @description
 */
public interface ReturnListGoodsService {

    ServiceVO save(ReturnList returnList, String returnListGoodsStr);

    Map<String,Object> list(String returnNumber,
                            Integer supplierId,
                            Integer state,
                            String sTime,
                            String eTime);

    Map<String,Object> goodsList(Integer returnListId);

    ServiceVO delete(Integer returnListId);

    ServiceVO updateState(Integer returnListId);

    String count(String sTime, String eTime ,Integer goodsTypeId, String codeOrName);
}
