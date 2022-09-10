package com.spirit.jxc.service.impl;

import com.spirit.jxc.dao.UnitDao;
import com.spirit.jxc.domain.ServiceVO;
import com.spirit.jxc.domain.SuccessCode;
import com.spirit.jxc.entity.Log;
import com.spirit.jxc.entity.Unit;
import com.spirit.jxc.service.LogService;
import com.spirit.jxc.service.UnitService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @description
 */
@Service
public class UnitServiceImpl implements UnitService {

    @Autowired
    private LogService logService;
    @Autowired
    private UnitDao unitDao;

    @Override
    public ServiceVO save(Unit unit) {

        logService.save(new Log(Log.INSERT_ACTION,"添加商品单位:"+unit.getUnitName()));

        unitDao.saveUnit(unit);

        return new ServiceVO<>(SuccessCode.SUCCESS_CODE, SuccessCode.SUCCESS_MESS);
    }

    @Override
    public ServiceVO delete(Integer unitId) {

            logService.save(new Log(Log.DELETE_ACTION,"删除商品单位:"+unitDao.getUnitByUnitId(unitId).getUnitName()));

            unitDao.delete(unitId);

        return new ServiceVO<>(SuccessCode.SUCCESS_CODE, SuccessCode.SUCCESS_MESS);
    }

    @Override
    public Map<String, Object> list() {
        Map<String,Object> map = new HashMap<>();

        List<Unit> unitList = unitDao.listAll();

        map.put("rows", unitList);

        return map;
    }
}
