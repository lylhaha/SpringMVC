package com.lyl.mapper;

import com.lyl.model.Post;
import java.util.List;

public interface PostMapper {
    int deleteByPrimaryKey(Integer postid);

    int insert(Post record);

    Post selectByPrimaryKey(Integer postid);

    List<Post> selectAll();

    int updateByPrimaryKey(Post record);
}