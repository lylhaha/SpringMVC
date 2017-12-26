package com.lyl.service;

import com.lyl.mapper.ManagerMapper;
import com.lyl.model.Manager;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import java.util.List;

/**
* Created by user on 2016/10/8.
*/
@Service
public class ManagerService {
    @Autowired
    ManagerMapper managerMapper;
    public List<Manager> selectManager(){

        return managerMapper.selectAll();
    }
}
