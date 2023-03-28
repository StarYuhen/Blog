package com.yuhen.mapper;

import com.yuhen.blog.BlogApplication;
import com.yuhen.domain.User;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest(classes = BlogApplication.class)
public class UserMapperTest {

    @Autowired
    private UserMapper userMapper;

    @Test
    public void TestUserSelect() {
        System.out.println(("----- selectAll method test ------"));
        List<User> userList = userMapper.selectList(null);
        userList.forEach(System.out::println);
    }
}
