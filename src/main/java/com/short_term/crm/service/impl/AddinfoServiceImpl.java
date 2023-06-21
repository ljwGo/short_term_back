package com.short_term.crm.service.impl;

import com.short_term.crm.entity.Addinfo;
import com.short_term.crm.mapper.AddinfoMapper;
import com.short_term.crm.service.IAddinfoService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author 东软集团
 * @since 2023-06-19
 */
@Service
public class AddinfoServiceImpl extends ServiceImpl<AddinfoMapper, Addinfo> implements IAddinfoService {

    @Autowired
    private AddinfoMapper addinfoMapper;

    @Override
    public List<Addinfo> getBaseInfos() {
        return addinfoMapper.getBaseInfos();
    }
}
