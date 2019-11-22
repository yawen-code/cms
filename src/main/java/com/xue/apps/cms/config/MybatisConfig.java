package com.xue.apps.cms.config;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@MapperScan("com.xue.apps.cms.dao")
public class MybatisConfig {

}
