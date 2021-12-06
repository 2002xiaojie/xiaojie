package edu.soft1.dao.impl;

import edu.soft1.dao.UserDao;
import edu.soft1.pojo.User;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

@Repository

public class UserDaoImpl implements UserDao {
    private User user;
    @Override
    public int add(User user) {
        String sql = "insert user(name,pwd) values(" +user.getUsername()+","+user.getPassword()+")";
        System.out.println("执行aql语句"+sql+",进行数据库add操作");
        return 1;
    }

    @Override
    public int delete(User user) {
        String sql = "insert user(name,pwd) values(" +user.getUsername()+","+user.getPassword()+")";
        System.out.println("执行aql语句"+sql+",进行数据库delete操作");
        return 1;
    }

    @Override
    public int update(User user) {
        String sql = "insert user(name,pwd) values(" +user.getUsername()+","+user.getPassword()+")";
        System.out.println("执行aql语句"+sql+",进行数据库update操作");
        return 1;
    }

    @Override
    public int query(User user) {
        String sql = "insert user(name,pwd) values(" +user.getUsername()+","+user.getPassword()+")";
        System.out.println("执行aql语句"+sql+",进行数据库query操作");
        return 1;
    }

}
