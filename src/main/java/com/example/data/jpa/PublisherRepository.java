package com.example.data.jpa;

import org.springframework.data.repository.ListCrudRepository;

import com.example.data.jpa.model.Publisher;

public interface PublisherRepository extends ListCrudRepository<Publisher, Long> {

}
