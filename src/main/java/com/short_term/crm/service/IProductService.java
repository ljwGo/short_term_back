package com.short_term.crm.service;

import com.short_term.crm.entity.Product;
import com.baomidou.mybatisplus.extension.service.IService;
import com.short_term.crm.tools.CommonResult;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author 东软集团
 * @since 2023-06-20
 */
public interface IProductService extends IService<Product> {
    CommonResult getProductQuery(String currentPageStr, String pageSize);
}
