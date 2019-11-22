package com.xue.apps.cms.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class WebConfig implements WebMvcConfigurer {
	@Override
	public void addCorsMappings(CorsRegistry registry) {
			//测试一般全放开
		registry.addMapping("/**")//允许访问任何资源
				.allowedOrigins("*")//允许所有ip访问；如果要上线不可以这么搞；可以设置一个ip，只有在这个区域的网络可以访问http://192.23.212.56
				.allowedMethods("GET","POST","PUT","OPTIONS","DELETE","PATCH")
				.allowedHeaders("*")//允许携带任何信息
				.allowCredentials(true)
				.maxAge(3600);
	}

}
