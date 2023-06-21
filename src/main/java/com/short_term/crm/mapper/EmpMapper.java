package com.short_term.crm.mapper;

import com.short_term.crm.entity.Emp;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * <p>
 * 员工信息表 Mapper 接口
 * </p>
 *
 * @author 东软集团
 * @since 2023-06-19
 */
// 也是接口, 不需要具体实现, 逻辑存放到xml中
public interface EmpMapper extends BaseMapper<Emp> {
    // 自定义的数据查询, 映射关系; @Param指定emp改名为param
    Emp login(@Param("param") Emp emp);
}
