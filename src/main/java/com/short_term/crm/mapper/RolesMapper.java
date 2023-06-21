package com.short_term.crm.mapper;

import com.short_term.crm.entity.Roles;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.short_term.crm.entity.Sysinfo;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

/**
 * <p>
 *  Mapper 接口
 * </p>
 *
 * @author 东软集团
 * @since 2023-06-19
 */
public interface RolesMapper extends BaseMapper<Roles> {
    List<Sysinfo> getMenu(@RequestParam("role_level") String roleno);
}
