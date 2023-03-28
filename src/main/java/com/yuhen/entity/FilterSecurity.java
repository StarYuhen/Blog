package com.yuhen.entity;

import org.springframework.security.access.ConfigAttribute;
import org.springframework.security.web.FilterInvocation;
import org.springframework.security.web.access.intercept.FilterInvocationSecurityMetadataSource;
import org.springframework.util.AntPathMatcher;

import java.util.Collection;

/**
 * 实现的Security动态分配器
 * 学习资料 <a href="https://juejin.cn/post/7188955977004089401">...</a>
 */
public class FilterSecurity implements FilterInvocationSecurityMetadataSource {

//    @Resource
//    private MenuService menuService;

//    private final AntPathMatcher antPathMatcher = new AntPathMatcher();

    @Override
    // 根据传入的安全对象参数返回其所需要的权限
    public Collection<ConfigAttribute> getAttributes(Object object) throws IllegalArgumentException {
//        // 获取当前URL地址
//        String requestURL = ((FilterInvocation) object).getRequest().getRequestURI();
//        // 对拥有所有路径的map进行匹配，可以存入redis和mybatis，这里也建议使用二级缓存caffeine
//        List<Menu> AllMenu = menuService.findAll();
//        // 做匹配
//        for (Menu menu : AllMenu) {
//            if (antPathMatcher.match(menu.getPattern(), requestURL)) {
//                // 匹配成功, 拿到 role 列表, 也就是我们的权限
//                if (menu.getRoleList() == null || menu.getRoleList().isEmpty()) {
//                    continue;
//                }
//                String[] roles = menu.getRoleList().stream().map(Role::getName).toArray(String[]::new);
//                return SecurityConfig.createList(roles);
//            }
//        }
        //无法匹配返回null
        return null;
    }

    @Override
    // 方法返回所有的角色/权限
    public Collection<ConfigAttribute> getAllConfigAttributes() {
        return null;
    }

    @Override
    public boolean supports(Class<?> clazz) {
        // 确定class的类和接口是否相同
        return FilterInvocation.class.isAssignableFrom(clazz);
    }
}
