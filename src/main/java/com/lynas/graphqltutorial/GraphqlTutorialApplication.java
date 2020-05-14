package com.lynas.graphqltutorial;

import com.lynas.graphqltutorial.model.Author;
import com.lynas.graphqltutorial.model.Post;
import com.lynas.graphqltutorial.repo.AuthorRepository;
import com.lynas.graphqltutorial.repo.PostRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.Arrays;
import java.util.UUID;

@SpringBootApplication
public class GraphqlTutorialApplication {

	public static void main(String[] args) {
		SpringApplication.run(GraphqlTutorialApplication.class, args);
	}

	@Bean
	public CommandLineRunner init(PostRepository postRepository, AuthorRepository authorRepository){
		return args -> {
			String author1id = UUID.randomUUID().toString();
			String author2id = UUID.randomUUID().toString();
			Post post1 = new Post(UUID.randomUUID().toString(), "t1", author1id);
			Post post2 = new Post(UUID.randomUUID().toString(), "t2", author1id);
			Post post3 = new Post(UUID.randomUUID().toString(), "t3", author2id);
			Post post4 = new Post(UUID.randomUUID().toString(), "t4", author2id);
			Post post5 = new Post(UUID.randomUUID().toString(), "t5", author2id);

			System.out.println("\n\n All Post \n\n");
			postRepository.saveAll(Arrays.asList(post1, post2, post3, post4, post5))
					.forEach(System.out::println);

			Author author1 = new Author(author1id, "n1");
			Author author2 = new Author(author2id, "n2");

			System.out.println("\n\n All Author \n\n");
			authorRepository.saveAll(Arrays.asList(author1, author2))
					.forEach(System.out::println);


		};
	}

}
