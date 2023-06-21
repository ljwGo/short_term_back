package com.short_term.crm.service;

import com.short_term.crm.entity.Roles;
import com.baomidou.mybatisplus.extension.service.IService;
import com.short_term.crm.tools.CommonResult;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author 东软集团
 * @since 2023-06-19
 */
public interface IRolesService extends IService<Roles> {
    CommonResult getMenu(String roleno);
}
