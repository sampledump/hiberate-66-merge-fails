package com.example.data.jpa;

import org.springframework.data.repository.ListCrudRepository;

import com.example.data.jpa.model.Recipient;

interface RecipientRepository extends ListCrudRepository<Recipient, Long> {

}
