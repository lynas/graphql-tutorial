package com.lynas.graphqltutorial;

import com.coxautodev.graphql.tools.GraphQLMutationResolver;
import com.lynas.graphqltutorial.model.Author;
import com.lynas.graphqltutorial.repo.AuthorRepository;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

import java.util.UUID;

@Component
@RequiredArgsConstructor
public class Mutation implements GraphQLMutationResolver {

    private final AuthorRepository authorRepository;

    public Author addAuthor(AuthorInput authorInput) {
        return authorRepository.save(new Author(
                UUID.randomUUID().toString(),
                authorInput.getName()
        ));
    }

}

@Data
@AllArgsConstructor
@NoArgsConstructor
class AuthorInput{
    private String name;
}
