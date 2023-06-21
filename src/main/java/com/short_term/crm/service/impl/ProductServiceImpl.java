package com.short_term.crm.service.impl;

import com.short_term.crm.entity.Product;
import com.short_term.crm.mapper.ProductMapper;
import com.short_term.crm.service.IProductService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.short_term.crm.tools.CommonResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author 东软集团
 * @since 2023-06-20
 */
@Service
public class ProductServiceImpl extends ServiceImpl<ProductMapper, Product> implements IProductService {

    @Autowired
    private ProductMapper productMapper;

    @Override
    public CommonResult getProductQuery(String currentPageStr, String pageSizeStr) {

        try{
            int currentPage = Integer.parseInt(currentPageStr);
            int pageSize = Integer.parseInt(pageSizeStr);
            int offset = (currentPage - 1) * pageSize;

            // myBatis提供的计算列数的api
            long count = count();

            List<Product> list = productMapper.getProductQuery(offset, pageSize);

            if (list == null || list.size() <= 0){
                return new CommonResult(null, 208);
            }

            HashMap<Object, Object> hashMap = new HashMap<Object, Object>();

            // 发送到前端的数据似乎都会被解析成键值对放到response.data中
            hashMap.put("current", currentPage);
            hashMap.put("size", pageSize);
            hashMap.put("total", count);
            hashMap.put("records", list);

            return new CommonResult(hashMap);
        }
        catch (Exception e){
            return new CommonResult(e, 500);
        }
    }
}
