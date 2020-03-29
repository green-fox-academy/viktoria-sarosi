package com.greenfoxacademy.reddit.repositories;

import com.greenfoxacademy.reddit.models.entities.Post;
import com.greenfoxacademy.reddit.models.entities.User;
import com.greenfoxacademy.reddit.models.entities.Vote;
import org.springframework.data.repository.CrudRepository;

import java.util.Optional;

public interface VoteRepository extends CrudRepository <Vote, Long> {
    Optional<Vote> findByPostAndUser( Post post, User user);
}
