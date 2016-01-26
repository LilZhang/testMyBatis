package oops;

import oops.bean.User;
import oops.dao.UserMapper;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.IOException;
import java.util.HashMap;
import java.util.List;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ) throws IOException
    {
        SqlSessionFactory sessionFactory = new SqlSessionFactoryBuilder().build(Resources.getResourceAsReader("mybatis-config.xml"));
        SqlSession sqlSession = sessionFactory.openSession();
        UserMapper userMapper = sqlSession.getMapper(UserMapper.class);

//        User user = userMapper.findById(2);
//
//        List<User> users = userMapper.findByPassword("123");
//
//        HashMap<String, String> map = new HashMap<String, String>();
//        map.put("name", "letian");
//        map.put("password", "123");
//        List<User> users2 = userMapper.findByNameAndPassword(map);

//        System.out.println("o");

//        User user1 = new User();
//        user1.setUsername("add1");
//        user1.setEmail("add1@111.com");
//        user1.setPassword("456");
//
//        userMapper.insertUser1(user1);
//        sqlSession.commit();    // necessary
//
//        User user2 = new User();
//        user2.setUsername("add2");
//        user2.setEmail("add2@111.com");
//        user2.setPassword("456");
//
//        userMapper.insertUser2(user2);
//        sqlSession.commit();    // necessary

//        User user = userMapper.findById(1);
//
//        user.setPassword("abc");
//
//        userMapper.updateUserPassword(user);

        User user = userMapper.findById(2);
//        userMapper.delete(user);
//
//        userMapper.deleteByGreaterThanId(3);

        sqlSession.commit();

        sqlSession.close();
    }
}
