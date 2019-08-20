package top.taru.information.service;

import top.taru.information.entity.User;

public interface UserService {
    User userLogin(String username, String password);
}
