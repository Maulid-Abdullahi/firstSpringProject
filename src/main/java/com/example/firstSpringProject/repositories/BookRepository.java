package com.example.firstSpringProject.repositories;

import com.example.firstSpringProject.model.Book;
import org.springframework.data.repository.CrudRepository;

public interface BookRepository extends CrudRepository<Book, Long> {
}
