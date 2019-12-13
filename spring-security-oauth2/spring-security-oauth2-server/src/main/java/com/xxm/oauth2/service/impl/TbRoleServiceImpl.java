package com.xxm.oauth2.service.impl;

import com.xxm.oauth2.mapper.TbRoleMapper;
import com.xxm.oauth2.service.TbRoleService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class TbRoleServiceImpl implements TbRoleService {

    @Resource
    private TbRoleMapper tbRoleMapper;

}
