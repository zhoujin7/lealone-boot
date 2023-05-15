package com.example.lealoneboot;

import com.example.lealoneboot.entity.User;
import com.example.lealoneboot.mapper.UserMapper;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import javax.annotation.Resource;
import java.time.LocalDateTime;

@SpringBootTest
class LealoneBootApplicationTests {
    @Resource
    UserMapper userMapper;

    @Test
    void contextLoads() {
        User user = new User();
        user.setUserId(1L);
        user.setMemo("aaaaaa");
        user.setGender(1);
        user.setNickname("张三");
        user.setUsername("zhangsan");
        user.setPassword("123");
        user.setPhone("15111111111");
        user.setCreatedAt(LocalDateTime.now());
        user.setCreatedBy("admin");
        userMapper.insert(user);
    }

}
