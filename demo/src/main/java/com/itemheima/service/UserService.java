package com.itemheima.service;

import com.itemheima.pojo.User;
import org.hibernate.validator.constraints.URL;

public interface UserService {
    //根据用户名查询用户
    User findByUsername(String username);
    //注册
    void register(String username, String password);
    //更新
    void update(User user);
    //更新头像
    void updateAvatar(String avatarUrl);
    //更新密码
    void updatePwd(String newPwd);
}
