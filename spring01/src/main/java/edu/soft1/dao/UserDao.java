package edu.soft1.dao;


import edu.soft1.pojo.User;

public interface UserDao {
    public int add(User user);
    public int delete(User user);
    public int update(User user);
    public int query(User user);
}
