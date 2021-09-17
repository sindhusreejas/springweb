package com.springframework.springweb.bootstrap;

import com.springframework.springweb.domain.Author;
import com.springframework.springweb.domain.Book;
import com.springframework.springweb.domain.Details;
import com.springframework.springweb.repositories.AuthorRepository;
import com.springframework.springweb.repositories.BookRepository;
import com.springframework.springweb.repositories.DetailsRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class BootStrapData implements CommandLineRunner {

    private final AuthorRepository authorRepository;
    private final BookRepository bookRepository;
    private final DetailsRepository detailsRepository;

    public BootStrapData(AuthorRepository authorRepository, BookRepository bookRepository, DetailsRepository detailsRepository) {
        this.authorRepository = authorRepository;
        this.bookRepository = bookRepository;
        this.detailsRepository = detailsRepository;
    }

    @Override
    public void run(String... args) throws Exception {

        Author eric = new Author("Eric", "Evans");
        Book somebook = new Book("some book name", "12345678");
        Details detail = new Details(123, "Hyderabad");

        eric.getBooks().add(somebook);
        somebook.getAuthors().add(eric);
        eric.getDetails().add(detail);

        authorRepository.save(eric);
        bookRepository.save(somebook);
        detailsRepository.save(detail);

        Author eric1 = new Author("Eric1", "Evans1");
        Book somebook1 = new Book("some book name1", "987654321");
        Details detail1 = new Details(234, "Ranga Reddy");

        eric.getBooks().add(somebook1);
        somebook.getAuthors().add(eric1);
        eric.getDetails().add(detail1);

        authorRepository.save(eric1);
        bookRepository.save(somebook1);
        detailsRepository.save(detail1);

        System.out.println("Hello");
        System.out.println("Book Count" +bookRepository.count());
        System.out.println("details Count" +detailsRepository.count());
//        System.out.println(eric);
//        System.out.println(eric1);



    }
}
