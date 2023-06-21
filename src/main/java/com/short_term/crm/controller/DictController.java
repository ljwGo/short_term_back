package com.short_term.crm.controller;


import com.short_term.crm.entity.Dict;
import com.short_term.crm.service.IDictService;
import com.short_term.crm.tools.CommonResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * <p>
 *  前端控制器
 * </p>
 *
 * @author 东软集团
 * @since 2023-06-19
 */
@RestController
@RequestMapping("/dict")
@CrossOrigin
public class DictController {
    @Autowired
    private IDictService dictService;

    @RequestMapping("/all")
    public CommonResult getDictAll(){
        List<Dict> list = dictService.list();

        if (list == null || list.size() <= 0){
            return new CommonResult(null, 208);
        }
        return new CommonResult(list);
    }

    @PutMapping("/add")
    public CommonResult add(@RequestBody Dict dict){
        // 为了启用数据库字段的自增功能s
        dict.setDictno(null);
        return new CommonResult(dictService.save(dict));
    }

    @PostMapping("/mod")
    public CommonResult modify(@RequestBody Dict dict){
        return new CommonResult(dictService.updateById(dict));
    }
}
