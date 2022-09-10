package com.spirit.jxc.service;

import javax.servlet.http.HttpSession;

/**
 * @description
 */
public interface MenuService {

    String loadMenu(HttpSession session);

    String loadCheckMenu(Integer roleId);

}
