package com.short_term.crm.mapper;

import com.short_term.crm.entity.Product;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

/**
 * <p>
 *  Mapper 接口
 * </p>
 *
 * @author 东软集团
 * @since 2023-06-20
 */
public interface ProductMapper extends BaseMapper<Product> {
    @Select("Select * From product Limit #{count} Offset #{offset}")
    List<Product> getProductQuery(int offset, int count);
}
