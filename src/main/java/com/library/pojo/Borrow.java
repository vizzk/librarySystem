package com.library.pojo;

/**
 * @author ：Vizzk
 * @description：TODO
 * @date ：2021/3/30 11:08
 */
public class Borrow {
    private String bookNO;
    private String studentNo;
    private String borrowDate;
    private int resting;
    private int order;

    public Borrow() {
    }

    public Borrow(String bookNO, String studentNo, String borrowDate, int resting, int order) {
        this.bookNO = bookNO;
        this.studentNo = studentNo;
        this.borrowDate = borrowDate;
        this.resting = resting;
        this.order = order;
    }

    public String getBookNO() {
        return bookNO;
    }

    public void setBookNO(String bookNO) {
        this.bookNO = bookNO;
    }

    public String getStudentNo() {
        return studentNo;
    }

    public void setStudentNo(String studentNo) {
        this.studentNo = studentNo;
    }

    public String getBorrowDate() {
        return borrowDate;
    }

    public void setBorrowDate(String borrowDate) {
        this.borrowDate = borrowDate;
    }

    public int getResting() {
        return resting;
    }

    public void setResting(int resting) {
        this.resting = resting;
    }

    public int getOrder() {
        return order;
    }

    public void setOrder(int order) {
        this.order = order;
    }

    @Override
    public String toString() {
        return "Borrow{" +
                "bookNO='" + bookNO + '\'' +
                ", studentNo='" + studentNo + '\'' +
                ", borrowDate='" + borrowDate + '\'' +
                ", resting=" + resting +
                ", order=" + order +
                '}';
    }
}
