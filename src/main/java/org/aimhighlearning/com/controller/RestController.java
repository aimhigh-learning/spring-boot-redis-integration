package org.aimhighlearning.com.controller;

import org.aimhighlearning.com.entity.Book;
import org.aimhighlearning.com.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

@org.springframework.web.bind.annotation.RestController
public class RestController {

    @Autowired
    private BookService bookService;


    @PostMapping("/book/save")
    public void save(@RequestBody Book book) {
       bookService.save(book);
    }

    @GetMapping("/book/{id}")
    public ResponseEntity<Book> get(@PathVariable String id) {
        return ResponseEntity.of(bookService.findById(id));
    }

    @GetMapping("/book/_all")
    public Iterable<Book> getAll() {
        return bookService.getAll();
    }
}
