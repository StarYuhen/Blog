package com.yuhen.mapper;

import com.yuhen.domain.User;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest
public class UserMapperTest {


    private UserMapper userMapper;

    @Test
    public void UserInsert() {
        List<User> users = userMapper.selectList(null);
        System.out.println(users);
    }
}
