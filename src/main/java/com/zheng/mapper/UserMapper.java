package com.zheng.mapper;

import com.zheng.domain.User;
import org.apache.ibatis.annotations.Select;

import java.util.List;

/**
 * Created by zhenglian on 2016/10/7.
 */
public interface UserMapper {
    @Select("select * from user")
    public List<User> findList();
}
