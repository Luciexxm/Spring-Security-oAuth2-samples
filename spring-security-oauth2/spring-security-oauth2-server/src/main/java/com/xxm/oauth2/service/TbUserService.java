package com.xxm.oauth2.service;


import com.xxm.oauth2.domain.TbUser;

public interface TbUserService {
    default TbUser getByUsername(String username) {
        return null;
    }
}
