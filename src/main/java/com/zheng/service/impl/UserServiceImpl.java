package com.zheng.service.impl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.zheng.domain.User;
import com.zheng.mapper.UserMapper;
import com.zheng.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by zhenglian on 2016/10/7.
 */
@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserMapper userMapper;

    @Override
    public List<User> findList() {
        PageHelper.startPage(1,1);
        List<User> list = userMapper.findList();
        PageInfo<User> info = new PageInfo<>(list);
        System.out.println(info.getFirstPage());
        System.out.println(info.getLastPage());
        System.out.println(info.getPageSize());
        System.out.println(info.getTotal());
        return list;
    }

    @Override
    public List<User> findUserByUsername(String username) {
        PageHelper.startPage(1,10,true);
        List<User> list = userMapper.findUserByUsername(username);
        PageInfo<User> info = new PageInfo<>(list);
        System.out.println(info.getTotal());
        return list;
    }
}
