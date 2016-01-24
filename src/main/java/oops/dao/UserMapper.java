package oops.dao;

import oops.bean.User;

import java.util.List;
import java.util.Map;

/**
 * Created by Administrator on 2016/1/24.
 */
public interface UserMapper {

    User findById(int id);

    List<User> findByPassword(String password);

    List<User> findByNameAndPassword(Map<String, String> userInfo);

    void insertUser1(User user);

    void insertUser2(User user);
}
