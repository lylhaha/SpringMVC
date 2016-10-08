package com.lyl.mapper;

import com.lyl.model.Manager;
import java.util.List;

public interface ManagerMapper {
    int deleteByPrimaryKey(Integer managerid);

    int insert(Manager record);

    Manager selectByPrimaryKey(Integer managerid);

    List<Manager> selectAll();

    int updateByPrimaryKey(Manager record);
}