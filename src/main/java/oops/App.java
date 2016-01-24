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

        User user = userMapper.findById(2);

        List<User> users = userMapper.findByPassword("123");

        HashMap<String, String> map = new HashMap<String, String>();
        map.put("name", "letian");
        map.put("password", "123");
        List<User> users2 = userMapper.findByNameAndPassword(map);

        System.out.println("o");
    }
}
