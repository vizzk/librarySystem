package com.library.mapper;

import com.library.pojo.Book;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface BookMapper {

    Book getBookByID(@Param("bookID") String id);
    List<Book> listBooks();
}
