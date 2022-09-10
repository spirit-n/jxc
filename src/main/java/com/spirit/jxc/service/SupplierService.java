package com.spirit.jxc.service;

import com.spirit.jxc.domain.ServiceVO;
import com.spirit.jxc.entity.Supplier;

import java.util.List;
import java.util.Map;

/**
 * @description
 */
public interface SupplierService {

    List<Supplier> getComboboxList(String q);

    Map<String,Object> list(Integer page, Integer rows, String supplierName);

    ServiceVO save(Supplier supplier);

    ServiceVO delete(String ids);
}
