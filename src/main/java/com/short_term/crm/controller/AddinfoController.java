package com.short_term.crm.controller;


import com.short_term.crm.entity.Addinfo;
import com.short_term.crm.service.IAddinfoService;
import com.short_term.crm.tools.CommonResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.bind.annotation.RestController;

import java.util.LinkedList;
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
@RequestMapping("/addi")
@CrossOrigin
public class AddinfoController {

    @Autowired
    private IAddinfoService addinfoService;

    @RequestMapping("/tree")
    public CommonResult getAddinfoTree(){
        List<Addinfo> allNodes = addinfoService.getBaseInfos();

        if (allNodes == null || allNodes.size() <= 0){
            return new CommonResult(null, 208);
        }

        Addinfo rootInfo = new Addinfo();
        rootInfo.setAddrno("00");
        rootInfo.setPreaddrno(null);

        getNodeRecursion(rootInfo, allNodes);

        System.out.println("递归结束了");

        return new CommonResult(rootInfo);
    }

    private void getNodeRecursion(Addinfo rootInfo, List<Addinfo> allNodes){
        List<Addinfo> children = new LinkedList<>();

        for (Addinfo node : allNodes){
            if (rootInfo.getAddrno().equals(node.getPreaddrno())){
                children.add(node);

                // 递归实现树的建立
                getNodeRecursion(node, allNodes);
            }
        }

        rootInfo.setChildren(children);
    }

}
