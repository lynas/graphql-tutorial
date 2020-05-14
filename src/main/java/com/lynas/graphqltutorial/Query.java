package com.lynas.graphqltutorial;

import com.coxautodev.graphql.tools.GraphQLQueryResolver;
import com.lynas.graphqltutorial.model.Author;
import com.lynas.graphqltutorial.model.Post;
import com.lynas.graphqltutorial.repo.AuthorRepository;
import com.lynas.graphqltutorial.repo.PostRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
@RequiredArgsConstructor
public class Query implements GraphQLQueryResolver {

    private final PostRepository postRepository;
    private final AuthorRepository authorRepository;

    public List<Post> posts(){
        return postRepository.findAll();
    }

    public List<Author> authors(){
        return authorRepository.findAll();
    }

    public Author author(String id) {
        return authorRepository.findById(id).orElse(null);
    }

}
