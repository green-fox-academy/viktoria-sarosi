package com.greenfoxacademy.reddit.repositories;

import com.greenfoxacademy.reddit.models.entities.Post;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PostRepository extends CrudRepository<Post, Long> {

    Iterable<Post> findAllByOrderByPointDesc();
}
