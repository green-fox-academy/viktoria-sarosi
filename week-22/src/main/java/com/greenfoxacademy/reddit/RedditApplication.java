package com.greenfoxacademy.reddit;

import com.greenfoxacademy.reddit.models.entities.Post;
import com.greenfoxacademy.reddit.repositories.PostRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class RedditApplication implements CommandLineRunner {

    private PostRepository postRepository;

    @Autowired
    public RedditApplication(PostRepository postRepository) {
        this.postRepository = postRepository;
    }

    public static void main(String[] args) {
        SpringApplication.run(RedditApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        postRepository.save(new Post("Aish.com", "https://www.aish.com/"));
        postRepository.save(new Post("Alfbeta.org", "https://www.alephbeta.org/"));
        postRepository.save(new Post("TorahAnyTime.com", "https://www.torahanytime.com/"));
        postRepository.save(new Post("Lativ.hu", "https://lativ.hu/"));

    }
}
