package com.short_term.crm.mapper;

import com.short_term.crm.entity.Addinfo;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

/**
 * <p>
 *  Mapper 接口
 * </p>
 *
 * @author 东软集团
 * @since 2023-06-19
 */
public interface AddinfoMapper extends BaseMapper<Addinfo> {
    @Select("Select addrno, aname, preaddrno From addinfo")
    List<Addinfo> getBaseInfos();
}
