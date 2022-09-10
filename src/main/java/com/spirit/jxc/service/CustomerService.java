package com.spirit.jxc.service;

import com.spirit.jxc.domain.ServiceVO;
import com.spirit.jxc.entity.Customer;

import java.util.List;
import java.util.Map;

/**
 * @description
 */
public interface CustomerService {

    Map<String,Object> list(Integer page, Integer rows, String customerName);

    ServiceVO save(Customer customer);

    ServiceVO delete(String ids);

    List<Customer> getComboboxList(String q);
}
