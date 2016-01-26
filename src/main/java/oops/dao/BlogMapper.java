package oops.dao;

import oops.bean.Blog;

/**
 * Created by Administrator on 2016/1/26.
 */
public interface BlogMapper {
    Blog findById(int id);
}
