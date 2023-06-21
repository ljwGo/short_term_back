package com.short_term.crm.service.impl;

import com.short_term.crm.entity.Emp;
import com.short_term.crm.mapper.EmpMapper;
import com.short_term.crm.service.IEmpService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.short_term.crm.tools.CommonResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 员工信息表 服务实现类
 * </p>
 *
 * @author 东软集团
 * @since 2023-06-19
 */
@Service
public class EmpServiceImpl extends ServiceImpl<EmpMapper, Emp> implements IEmpService {

    @Autowired
    private EmpMapper empMapper;

    // service使用mapper获取后端的数据
    @Override
    public CommonResult login(Emp emp) {
         Emp loginEmp = empMapper.login(emp);
         if (loginEmp == null){
             return new CommonResult(null, 208);
         }
         return new CommonResult(loginEmp);
    }
}
