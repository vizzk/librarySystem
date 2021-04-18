package com.library.service;

import com.library.mapper.BorrowMapper;
import com.library.pojo.Borrow;

import java.util.List;

/**
 * @author ：Vizzk
 * @description：TODO
 * @date ：2021/4/5 12:00
 */
public class BorrowServiceImpl implements BorrowService{
    private BorrowMapper mapper;

    public void setMapper(BorrowMapper mapper) {
        this.mapper = mapper;
    }

    @Override
    //查阅借书记录
    public List<Borrow> getBorrowBooksByStudentID(String number) {
        return mapper.getBorrowBooksByStudentID(number);
    }

    @Override
    public int updateRecordOnVisible(int order){
        return mapper.updateRecordOnVisible(order);
    }

}
