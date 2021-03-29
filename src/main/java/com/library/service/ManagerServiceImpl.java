package com.library.service;

import com.library.mapper.ManagerMapper;
import com.library.pojo.Manager;

/**
 * @author ：Vizzk
 * @description：TODO
 * @date ：2021/3/28 20:05
 */
public class ManagerServiceImpl implements ManagerService{
    private ManagerMapper mapper;

    public void setMapper(ManagerMapper mapper) {
        this.mapper = mapper;
    }

    @Override
    public Manager getManagerByID(String number) {
        return mapper.getManagerByID(number);
    }
}
