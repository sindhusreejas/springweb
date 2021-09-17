package com.springframework.springweb.repositories;

import com.springframework.springweb.domain.Author;
import org.springframework.data.repository.CrudRepository;

public interface AuthorRepository extends CrudRepository<Author , Long>{
}
