package com.example.data.jpa;

import java.util.Optional;
import java.util.stream.Stream;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.ListCrudRepository;

import com.example.data.jpa.model.Author;

public interface AuthorRepository extends ListCrudRepository<Author, Long> {

	Optional<Author> findByNameContainingIgnoreCase(String partialName);

	@Query("SELECT a FROM Author a WHERE a.name = :name")
	Optional<Author> queryFindByName(String name);

	@Query(value = "SELECT * FROM author WHERE name = :name", nativeQuery = true)
	Optional<Author> nativeQueryFindByName(String name);

	Stream<Author> findByNameContaining(String name);

}
