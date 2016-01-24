package oops.dao;

import oops.bean.User;

import java.util.List;

/**
 * Created by Administrator on 2016/1/24.
 */
public interface UserMapper {

    User findById(int id);

    List<User> findByPassword(String password);
}
