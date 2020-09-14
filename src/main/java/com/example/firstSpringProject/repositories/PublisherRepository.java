package com.example.firstSpringProject.repositories;

import com.example.firstSpringProject.model.Publisher;
import org.springframework.data.repository.CrudRepository;

public interface PublisherRepository extends CrudRepository<Publisher, Long> {

}
