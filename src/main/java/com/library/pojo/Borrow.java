package com.library.pojo;

/**
 * @author ：Vizzk
 * @description：TODO
 * @date ：2021/3/30 11:08
 */
public class Borrow {
    private String studentNo;
    private String borrowDate;
    private int resting;
    private boolean visable;
    private int order;
    private Book book;

    public Borrow() {
    }

    public Borrow(String studentNo, String borrowDate, int resting, boolean visable, int order, Book book) {
        this.studentNo = studentNo;
        this.borrowDate = borrowDate;
        this.resting = resting;
        this.visable = visable;
        this.order = order;
        this.book = book;
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

    public boolean isVisable() {
        return visable;
    }

    public void setVisable(boolean visable) {
        this.visable = visable;
    }

    public int getOrder() {
        return order;
    }

    public void setOrder(int order) {
        this.order = order;
    }

    public Book getBook() {
        return book;
    }

    public void setBook(Book book) {
        this.book = book;
    }

    @Override
    public String toString() {
        return "Borrow{" +
                "studentNo='" + studentNo + '\'' +
                ", borrowDate='" + borrowDate + '\'' +
                ", resting=" + resting +
                ", visable=" + visable +
                ", order=" + order +
                ", book=" + book +
                '}';
    }
}
