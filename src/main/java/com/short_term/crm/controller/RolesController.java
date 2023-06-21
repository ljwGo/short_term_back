package com.short_term.crm.controller;


import com.short_term.crm.entity.Emp;
import com.short_term.crm.entity.Roles;
import com.short_term.crm.service.IEmpService;
import com.short_term.crm.service.IRolesService;
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
@CrossOrigin
@RequestMapping("/role")
public class RolesController {
    @Autowired
    public IRolesService rolesService;

    @RequestMapping("/all")  // 这里必须是双引号而不是单引号
    public CommonResult getRolesList(){
        List<Roles> list = rolesService.list();

        if (list == null || list.size() <= 0){
            return new CommonResult(null, 208);
        }

        return new CommonResult(list);
    }

    /*
        get方式获取参数有两种方式:
            一种是使用@PathVariable, 它需要在路由中使用{}声明变量
                优点是, 可以在不知道前端发送的参数名就获取到指定位置的数据
            另一种是使用@RequestParam
                使用它, 必须直到key值
        post方式获取数据的方式
    */
    @CrossOrigin
    @GetMapping("/rights/{role_level}")
    public CommonResult getMenu(@PathVariable("role_level") String roleno){
        return rolesService.getMenu(roleno);
    }
}
