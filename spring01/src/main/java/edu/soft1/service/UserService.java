package edu.soft1.service;

import edu.soft1.pojo.User;

public interface UserService {
    public int add(User user);
    public int delete(User user);
    public int update(User user);
    public int query(User user);
}
