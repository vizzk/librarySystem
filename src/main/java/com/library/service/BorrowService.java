package com.library.service;

import com.library.pojo.Borrow;
import org.apache.ibatis.annotations.Param;

import java.util.Date;
import java.util.List;

public interface BorrowService {
    List<Borrow> getBorrowBooksByStudentID(String number);
    int updateRecordOnVisible(int order);
    Borrow getBorrowRecordByBook(int number);
    List<Borrow> getAllRecord();
    Integer saveBorrowRecord(String account, int bookID, Date date);

}
