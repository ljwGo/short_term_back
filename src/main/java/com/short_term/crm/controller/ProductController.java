package com.short_term.crm.controller;


import com.short_term.crm.entity.Product;
import com.short_term.crm.service.IProductService;
import com.short_term.crm.tools.CommonResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * <p>
 *  前端控制器
 * </p>
 *
 * @author 东软集团
 * @since 2023-06-20
 */
@RestController
@RequestMapping("/product")
@CrossOrigin
public class ProductController {

    @Autowired
    private IProductService productService;

    @RequestMapping("/qry/paged/{currentPage}/{pageSize}")
    public CommonResult getProductQuery(@PathVariable("currentPage") String currentPageStr, @PathVariable("pageSize") String pageSizeStr){
        return productService.getProductQuery(currentPageStr, pageSizeStr);
    }
}
