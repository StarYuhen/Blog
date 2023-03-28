package com.yuhen.entity;

import jakarta.annotation.Resource;
import org.springframework.cache.Cache;
import org.springframework.cache.CacheManager;
import org.springframework.cache.annotation.CacheEvict;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class MenuService {
    public static final String FIND_ALL = "FIND_ALL";

    @Resource
    private CacheManager cacheManager;

    @Resource
    private MenuMapper menuMapper;

    public static final String CACHE_NAME = "MENU_SERVICE";

    @Cacheable(value = CACHE_NAME, key = FIND_ALL, unless = "#result?.size() == 0")
    public List<Menu> findAll() {
//        return menuMapper.getAllMenu();
        return null;
    }

    public int insert(Menu menu) {
        Optional<Cache> optionalCache = Optional.ofNullable(cacheManager.getCache(CACHE_NAME));
        optionalCache.ifPresent(cache -> cache.evictIfPresent(FIND_ALL));
        return menuMapper.insert(menu);
    }

    @CacheEvict(value = CACHE_NAME, key = "'id_'+#record.id")
    public int update(Menu record) {
        Optional<Cache> optionalCache = Optional.ofNullable(cacheManager.getCache(CACHE_NAME));
        optionalCache.ifPresent(cache -> cache.evictIfPresent(FIND_ALL));
        return menuMapper.updateByPrimaryKeySelective(record);
    }

    @Cacheable(value = CACHE_NAME, key = "'id_'+#id")
    public Menu selectById(Long id) {
        return menuMapper.selectByPrimaryKey(id);
    }

    @CacheEvict(cacheNames = CACHE_NAME, key = "'id_'+#id")
    public int deleteById(Long id) {
        return menuMapper.deleteByPrimaryKey(id);
    }

}

