package com.lynas.graphqltutorial.repo;

import com.lynas.graphqltutorial.model.Author;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AuthorRepository extends JpaRepository<Author, String> {
}
