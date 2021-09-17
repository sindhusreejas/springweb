package com.springframework.springweb.repositories;

import com.springframework.springweb.domain.Book;
import org.springframework.data.repository.CrudRepository;

public interface BookRepository extends CrudRepository<Book , Long> {
}
