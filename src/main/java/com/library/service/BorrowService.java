package com.library.service;

import com.library.pojo.Borrow;

import java.util.List;

public interface BorrowService {
    List<Borrow> getBorrowBooksByStudentID(String number);
    int updateRecordOnVisible(int order);
    Borrow getBorrowRecordByBook(String number);
}
