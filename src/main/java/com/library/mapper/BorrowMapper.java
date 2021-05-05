package com.library.mapper;

import com.library.pojo.Borrow;

import java.util.List;

public interface BorrowMapper {
    List<Borrow> getBorrowBooksByStudentID(String number);
    int updateRecordOnVisible(int order);
    Borrow getBorrowRecordByBook(int number);
}
