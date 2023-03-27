package com.yuhen.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.access.ConfigAttribute;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.http.SessionCreationPolicy;
import org.springframework.security.web.SecurityFilterChain;

import java.util.Map;


// 实现动态
interface DynamicSecurityService {
    Map<String, ConfigAttribute> loadDataSource();
}


/**
 * 配置Security
 * WebSecurityConfigurerAdapter 方法被废弃
 * 借鉴 <a href="https://github.com/macrozheng/mall-learning/tree/master/mall-tiny-security">...</a>
 * EnableWebSecurity  倘若不使用，则会提示无法自动装配httpSecurity
 */
@Configuration
@EnableWebSecurity
public class SpringSecurity {

    // 新版重写特性
    @Bean
    SecurityFilterChain filterChain(HttpSecurity httpSecurity) throws Exception {
        httpSecurity.csrf()
                .disable()
                .sessionManagement()
                .sessionCreationPolicy(SessionCreationPolicy.STATELESS)
                .and()
                .authorizeRequests()
                .anyRequest()
                .authenticated();

        // 检测是否允许过滤器实现基于路径的动态权限认证


        return httpSecurity.build();
    }
}


