package com.short_term.crm.service.impl;

import com.short_term.crm.entity.Dept;
import com.short_term.crm.mapper.DeptMapper;
import com.short_term.crm.service.IDeptService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.short_term.crm.tools.CommonResult;
import org.springframework.stereotype.Service;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author 东软集团
 * @since 2023-06-19
 */
@Service
public class DeptServiceImpl extends ServiceImpl<DeptMapper, Dept> implements IDeptService {
}
