package edu.soft1.dao;

import edu.soft1.dao.UserDao;
import edu.soft1.dao.UserService;
import edu.soft1.pojo.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

//@Service
public class UserServiceImpl implements UserService{
    private UserDao userDao;
    @Autowired
    @Qualifier("userDaoImpl")
    public void setDao(UserDao userDao){
        this.userDao = userDao;
    }

    @Override
    public int add(User user) {
        return userDao.add(user);
    }
}
