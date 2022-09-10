package com.spirit.jxc.service;

import com.spirit.jxc.domain.ServiceVO;
import com.spirit.jxc.entity.PurchaseList;

import java.util.Map;

/**
 * @description
 */
public interface PurchaseListGoodsService {

    ServiceVO save(PurchaseList purchaseList, String purchaseListGoodsStr);

    Map<String, Object> list(String purchaseNumber,
                            Integer supplierId,
                            Integer state,
                            String sTime,
                            String eTime);

    Map<String, Object> goodsList(Integer purchaseListId);

    ServiceVO delete(Integer purchaseListId);

    ServiceVO updateState(Integer purchaseListId);

    String count(String sTime, String eTime ,Integer goodsTypeId, String codeOrName);
}
