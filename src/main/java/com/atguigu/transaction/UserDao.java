package com.atguigu.transaction;

import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.RestController;

@Repository
public interface UserDao {
    User getUser(Long id);
    int insertUser(User user);
}
