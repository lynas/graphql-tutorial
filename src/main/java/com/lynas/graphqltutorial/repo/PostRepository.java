package com.lynas.graphqltutorial.repo;

import com.lynas.graphqltutorial.model.Post;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface PostRepository extends JpaRepository<Post, String> {
}
