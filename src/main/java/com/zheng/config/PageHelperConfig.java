package com.zheng.config;

import com.github.pagehelper.PageHelper;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.Properties;

/**
 * pager plugin https://github.com/pagehelper/Mybatis-PageHelper
 * Created by zhenglian on 2016/10/7.
 */
@Configuration
public class PageHelperConfig {

    @Bean
    public PageHelper pageHelper() {
        PageHelper helper = new PageHelper();
        Properties props = new Properties();
        props.setProperty("offsetAsPageNum", "true");
        props.setProperty("rowBoundsWithCount", "true");
        props.setProperty("pageSizeZero", "true");
        props.setProperty("reasonable", "true");
        helper.setProperties(props);

        return helper;
    }
}
