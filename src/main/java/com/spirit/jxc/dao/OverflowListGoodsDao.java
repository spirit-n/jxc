package com.spirit.jxc.dao;

import com.spirit.jxc.entity.OverflowList;
import com.spirit.jxc.entity.OverflowListGoods;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * @description 商品报溢
 */
public interface OverflowListGoodsDao {

    Integer saveOverflowList(OverflowList overflowList);

    Integer saveOverflowListGoods(OverflowListGoods overflowListGoods);

    List<OverflowList> getOverflowlist(@Param("sTime") String sTime, @Param("eTime") String eTime);

    List<OverflowListGoods> getOverflowListGoodsByOverflowListId(Integer overflowListId);
}
