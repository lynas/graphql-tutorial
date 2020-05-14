package com.lynas.graphqltutorial;

import com.coxautodev.graphql.tools.GraphQLResolver;
import com.lynas.graphqltutorial.model.Author;
import com.lynas.graphqltutorial.model.Post;
import com.lynas.graphqltutorial.repo.AuthorRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class AuthorResolver implements GraphQLResolver<Post> {
    private final AuthorRepository authorRepository;
    public Author author(Post post) {
        return authorRepository.findById(post.getAuthorId()).orElse(null);
    }
}
