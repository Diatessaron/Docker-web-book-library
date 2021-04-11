package ru.otus.dockerwebbooklibrary.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import ru.otus.dockerwebbooklibrary.domain.Genre;

import java.util.Optional;

public interface GenreRepository extends MongoRepository<Genre, String> {
    Optional<Genre> findByName(String name);

    void deleteByName(String name);
}
