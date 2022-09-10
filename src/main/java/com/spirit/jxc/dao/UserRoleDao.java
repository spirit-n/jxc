package com.spirit.jxc.dao;

import com.spirit.jxc.entity.UserRole;

/**
 * @description 用户角色
 */
public interface UserRoleDao {

    // 根据用户id删除用户角色
    Integer deleteUserRoleByUserId(Integer userId);

    // 为用户添加角色
    Integer addUserRole(UserRole userRole);
}
