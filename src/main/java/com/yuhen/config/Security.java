package com.yuhen.config;

import com.yuhen.entity.FilterSecurity;
import jakarta.annotation.Resource;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.web.SecurityFilterChain;


/**
 * 配置Security
 * WebSecurityConfigurerAdapter 方法被废弃
 * 借鉴 <a href="https://github.com/macrozheng/mall-learning/tree/master/mall-tiny-security">...</a>
 * 文档 <a href="https://springdoc.cn/spring-security/servlet/authentication/index.html">...</a>
 * EnableWebSecurity  倘若不使用，则会提示无法自动装配httpSecurity
 */
@Configuration
@EnableWebSecurity
public class Security {


//    @Resource
//    private FilterSecurity filterSecurity;

    // 新版重写特性
    @Bean
    SecurityFilterChain filterChain(HttpSecurity httpSecurity) throws Exception {
        // ApplicationContext applicationContext = httpSecurity.getSharedObject(ApplicationContext.class);
//        httpSecurity
//                .apply(new UrlAuthorizationConfigurer<>(applicationContext))
//                .withObjectPostProcessor(new ObjectPostProcessor<AuthorizationFilter>() {
//                    @Override
//                    public <O extends AuthorizationFilter> O postProcess(O object) {
//                        object.setSecurityContextHolderStrategy((SecurityContextHolderStrategy) filterSecurity);
//                        return null;
//                    }
//                    // 旧方法被弃用 UrlAuthorizationConfigurer,FilterSecurityInterceptor
////                    @Override
////                    public <O extends FilterSecurityInterceptor> O postProcess(O object) {
////                        object.setSecurityMetadataSource(filterSecurity);
////                        // 所有的url必须在数据库中存在, 才能够访问, 否则不行
////                        // object.setRejectPublicInvocations(true);
////                        return object;
////                    }
//                })
//                .and()
//                .csrf()
//                .disable()
//                .sessionManagement()
//                .sessionCreationPolicy(SessionCreationPolicy.STATELESS)
//                .and()
//                .authorizeRequests()
//                .anyRequest()
//                .authenticated();


//        // 新版
//        httpSecurity
//                .authorizeHttpRequests((authorization) -> authorization
//                                .anyRequest()
//                                .access(new AuthManager())
//

        // 检测是否允许过滤器实现基于路径的动态权限认证


        return httpSecurity.build();
    }
}


