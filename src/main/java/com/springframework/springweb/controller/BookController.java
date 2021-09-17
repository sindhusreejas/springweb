package com.springframework.springweb.controller;


import com.springframework.springweb.repositories.BookRepository;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class BookController {

    private final BookRepository bookRepository;

    public BookController(BookRepository bookRepository) {
        this.bookRepository = bookRepository;
    }

    @RequestMapping("books/books")
    public String getBooks(Model model){

        // model object will be given to view for presentation.

        model.addAttribute("books",bookRepository.findAll() );

        return "books/books/list";

    }
}
