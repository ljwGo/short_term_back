package com.short_term.crm.service;

import com.short_term.crm.entity.Emp;
import com.baomidou.mybatisplus.extension.service.IService;
import com.short_term.crm.tools.CommonResult;

/**
 * <p>
 * 员工信息表 服务类
 * </p>
 *
 * @author 东软集团
 * @since 2023-06-19
 */
// 接口, 不用关心具体实现逻辑是什么
public interface IEmpService extends IService<Emp> {
    CommonResult login(Emp emp);
}
