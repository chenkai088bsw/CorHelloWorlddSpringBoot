package com.atguigu.jdbcTemplateTest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Service;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Date;

@Service
public class JdbcTemplateServiceImpl implements JdbcTmplUserService{
    @Autowired
    private JdbcTemplate jdbcTemplate;
    @Override
    public void testCount() {
        String sql = "select count(*) from user";
        int count = jdbcTemplate.queryForObject(sql,Integer.class);
        System.out.println("+++++++++++++++++++++++++++++");
        System.out.println(count);
        System.out.println("+++++++++++++++++++++++++++++");
    }

    @Override
    public User getUser(int id) {
        String sql = "select * from user where id =?";
        User user = jdbcTemplate.queryForObject(sql,new MyRowMapper(),id);
        System.out.println(user.getUserName()+" "+user.getData()+" "+user.getSex()+" "+user.getAddress());
        return null;
    }
}

class MyRowMapper implements RowMapper<User>{

    @Override
    public User mapRow(ResultSet resultSet, int i) throws SQLException {
        String username = resultSet.getString("username");
        Date date = resultSet.getDate("birthday");
        String sex = resultSet.getString("sex");    //?????
        String address = resultSet.getString("address");
        User user = new User();
        user.setUserName(username);
        user.setData(date);
        user.setAddress(address);
        user.setSex(sex);
        return user;
    }
}










