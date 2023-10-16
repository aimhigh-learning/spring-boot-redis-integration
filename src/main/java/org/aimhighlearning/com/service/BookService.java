package org.aimhighlearning.com.service;

import org.aimhighlearning.com.entity.Book;
import org.aimhighlearning.com.repository.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

import java.util.Iterator;
import java.util.Optional;

@Component
public class BookService {

    @Autowired @Lazy
    public BookRepository bookRepository;

    public  void save(Book book) {
        bookRepository.save(book);
    }

    public Optional<Book> findById(String id) {
        return bookRepository.findById(id);
    }

    public Iterable<Book> getAll() {
        return bookRepository.findAll();
    }
}
