package com.xxm.oauth2.resource.service.impl;

import com.xxm.oauth2.resource.mapper.TbContentCategoryMapper;
import com.xxm.oauth2.resource.service.TbContentCategoryService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class TbContentCategoryServiceImpl implements TbContentCategoryService {

    @Resource
    private TbContentCategoryMapper tbContentCategoryMapper;

}
