package com.short_term.crm.service;

import com.short_term.crm.entity.Addinfo;
import com.baomidou.mybatisplus.extension.service.IService;

import java.util.List;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author 东软集团
 * @since 2023-06-19
 */
public interface IAddinfoService extends IService<Addinfo> {
    List<Addinfo> getBaseInfos();
}
