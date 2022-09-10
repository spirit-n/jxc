package com.spirit.jxc.service;

import com.spirit.jxc.domain.ServiceVO;
import com.spirit.jxc.entity.Unit;

import java.util.Map;

/**
 * @description
 */
public interface UnitService {

    ServiceVO save(Unit unit);

    ServiceVO delete(Integer unitId);

    Map<String,Object> list();
}
