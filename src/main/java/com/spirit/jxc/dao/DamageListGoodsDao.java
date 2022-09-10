package com.spirit.jxc.dao;

import com.spirit.jxc.entity.DamageList;
import com.spirit.jxc.entity.DamageListGoods;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * @description 商品报损
 */
public interface DamageListGoodsDao {

    Integer saveDamageList(DamageList damageList);

    Integer saveDamageListGoods(DamageListGoods damageListGoods);

    List<DamageList> getDamagelist(@Param("sTime") String sTime,@Param("eTime") String eTime);

    List<DamageListGoods> getDamageListGoodsByDamageListId(Integer damageListId);
}
