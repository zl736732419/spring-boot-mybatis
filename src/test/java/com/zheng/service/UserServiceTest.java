package com.zheng.service;

import com.zheng.domain.User;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

/**
 * Created by zhenglian on 2016/10/7.
 */
public class UserServiceTest extends BaseServiceTest {

    @Autowired
    private UserService userService;

    @Test
    public void testList() {
        List<User> list = userService.findList();
        System.out.println("----------------");
        System.out.println(list.size());
        System.out.println(list.get(0));
    }

    @Test
    public void testFindByUsername() {
        String username = "i";
        List<User> list = userService.findUserByUsername(username);
        System.out.println(list.size());
        System.out.println(list);
    }
}
