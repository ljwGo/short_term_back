package com.short_term.crm.controller;


import com.short_term.crm.entity.Dept;
import com.short_term.crm.entity.Dict;
import com.short_term.crm.service.IDeptService;
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
 * @since 2023-06-18
 */
@RestController
@RequestMapping("/dept")
@CrossOrigin
public class DeptController {
    // 自动分配变量值
    @Autowired
    private IDeptService deptService;

    @RequestMapping("/all")
    public CommonResult getDeptList(){
        List<Dept> list = deptService.list();

        if (list == null || list.size() <= 0){
            return new CommonResult(null, 208);
        }
        return new CommonResult(list);
    }

    @DeleteMapping("/del/{dept_id}")
    public CommonResult delDepById(@PathVariable("dept_id") String dept_id){
        return new CommonResult(deptService.removeById(dept_id));
    }

    @PostMapping("/mod")
    public CommonResult modify(@RequestBody Dept dept){
        return new CommonResult(deptService.updateById(dept));
    }

    @PutMapping("/add")
    public CommonResult add(@RequestBody Dept dept){
        dept.setDeptno(null);
        return new CommonResult(deptService.save(dept));
    }
}
