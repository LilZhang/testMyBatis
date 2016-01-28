package oops.dao;

import oops.bean.Blog;

import java.util.HashMap;
import java.util.List;

/**
 * Created by Administrator on 2016/1/26.
 */
public interface BlogMapper {
    Blog findById(int id);

    List<Blog> findAll();
    List<Blog> findAll2(HashMap<String, Integer> offsetLimit);
}
