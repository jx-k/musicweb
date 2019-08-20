package top.taru.information.dao;

import top.taru.information.entity.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface UserDao {
    User userLogin(@Param("username") String username, @Param("password") String password);
}
