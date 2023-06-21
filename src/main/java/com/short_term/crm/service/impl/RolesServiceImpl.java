package com.short_term.crm.service.impl;

import com.short_term.crm.entity.Roles;
import com.short_term.crm.entity.Sysinfo;
import com.short_term.crm.mapper.RolesMapper;
import com.short_term.crm.service.IRolesService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.short_term.crm.tools.CommonResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author 东软集团
 * @since 2023-06-19
 */
@Service
public class RolesServiceImpl extends ServiceImpl<RolesMapper, Roles> implements IRolesService {

    @Autowired
    private RolesMapper rolesMapper;

    @Override
    public CommonResult getMenu(String roleno) {
        List<Sysinfo> list = rolesMapper.getMenu(roleno);

        if (list == null || list.size() <= 0){
            return new CommonResult(null, 208);
        }

        return new CommonResult(list);
    }
}
