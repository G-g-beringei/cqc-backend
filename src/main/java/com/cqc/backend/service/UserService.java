package com.cqc.backend.service;

import com.cqc.backend.model.UserInfo;

/**
 * author:Junqson
 * create:2018/4/13 23:51
 * des:
 */
public interface UserService {
    UserInfo createNewAccount(String user, String pwd);
    UserInfo getUser(String user);
}
