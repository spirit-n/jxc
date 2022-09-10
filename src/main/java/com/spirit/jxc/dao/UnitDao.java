package com.spirit.jxc.dao;

import com.spirit.jxc.entity.Unit;

import java.util.List;

/**
 * @description 商品单位
 */
public interface UnitDao {

    Integer saveUnit(Unit unit);

    Integer delete(Integer unitId);

    List<Unit> listAll();

    Unit getUnitByUnitId(Integer unitId);
}
