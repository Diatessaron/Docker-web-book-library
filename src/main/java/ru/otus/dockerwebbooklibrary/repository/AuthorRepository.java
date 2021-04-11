package ru.otus.dockerwebbooklibrary.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import ru.otus.dockerwebbooklibrary.domain.Author;

import java.util.List;

public interface AuthorRepository extends MongoRepository<Author, String> {
    List<Author> findByName(String name);

    void deleteByName(String name);
}
