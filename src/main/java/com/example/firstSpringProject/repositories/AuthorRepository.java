package com.example.firstSpringProject.repositories;

import com.example.firstSpringProject.model.Author;
import org.springframework.data.repository.CrudRepository;

public interface AuthorRepository extends CrudRepository<Author, Long> {
}
