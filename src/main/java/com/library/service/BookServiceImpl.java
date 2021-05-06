package com.library.service;

import com.library.mapper.BookMapper;
import com.library.pojo.Book;

import java.util.List;

/**
 * @author ：Vizzk
 * @description：TODO
 * @date ：2021/3/25 19:57
 */
public class BookServiceImpl implements BookService{
    private BookMapper mapper;

    public void setMapper(BookMapper mapper){
        this.mapper = mapper;
    }


    @Override
    public Book getBookByID(String id) {
        return mapper.getBookByID(id);
    }

    @Override
    public List<Book> listBooks() {
        return mapper.listBooks();
    }

    @Override
    public int insertBook(Book book) { return mapper.insertBook(book); }

    @Override
    public List<Book> getBookByKeyword(String keyword) {
        return mapper.getBookByKeyword(keyword);
    }
}
