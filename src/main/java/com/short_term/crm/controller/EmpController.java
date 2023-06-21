package com.short_term.crm.controller;


import com.short_term.crm.entity.Emp;
import com.short_term.crm.service.IEmpService;
import com.short_term.crm.tools.CommonResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * <p>
 * 员工信息表 前端控制器
 * </p>
 *
 * @author 东软集团
 * @since 2023-06-19
 */
@RestController
@RequestMapping("/emp")
@CrossOrigin
public class EmpController {

    @Autowired
    public IEmpService empService;

    @RequestMapping("/all")  // 这里必须是双引号而不是单引号
    public CommonResult getEmpList(){
        List<Emp> list = empService.list();

        if (list == null || list.size() <= 0){
            return new CommonResult(null, 208);
        }

        return new CommonResult(list);
    }

// control调用service
    @PostMapping("/login")
    public CommonResult login(@RequestBody Emp emp){  // 声明从body中获取emp对象, 没有post参数集合对象
        return empService.login(emp);
    }
}
