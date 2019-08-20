package top.taru.information.service.impl;

import top.taru.information.dao.UserDao;
import top.taru.information.entity.User;
import top.taru.information.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserImpl implements UserService {
    @Autowired
    UserDao userDao;

  public User userLogin(String username, String password){
      return  userDao.userLogin("","");
  };
}
