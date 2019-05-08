package com.xjx.test.crossdomain.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

/**
 * @program: lottery
 * @description:
 * @author: 谢庆香
 * @create: 2019-05-08 10:28
 **/

@Configuration
@EnableAspectJAutoProxy(proxyTargetClass=true)
public class MvConfig extends WebMvcConfigurerAdapter {

    @Override
    public void addCorsMappings(CorsRegistry registry) {
        registry.addMapping("/**")
                .allowedOrigins("*")
                .allowedMethods("POST", "GET", "PUT", "OPTIONS", "DELETE")
                .maxAge(10)
                .allowCredentials(true);

    }

}