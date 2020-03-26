package com.greenfoxacademy.reddit.services;

import com.greenfoxacademy.reddit.models.entities.Post;
import com.greenfoxacademy.reddit.models.entities.User;
import com.greenfoxacademy.reddit.repositories.PostRepository;
import com.greenfoxacademy.reddit.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class PostService {
    private PostRepository postRepository;
    private UserRepository userRepository;

    @Autowired
    public PostService(PostRepository postRepository, UserRepository userRepository) {
        this.postRepository = postRepository;
        this.userRepository = userRepository;
    }

    public List<Post> findAllPosts() {
        return (List<Post>) postRepository.findAllByOrderByPointDesc();
    }


    public void upVote(long id, long userId) {
        Optional<Post> optionalPost = postRepository.findById(id);
        Post post = optionalPost.orElse(null);
        Optional<User> optionalUser = userRepository.findById(userId);
        User user = optionalUser.orElse(null);
        assert post != null;
        post.upVote(user);
        postRepository.save(post);
    }

    public void submitNewPost(Post post, Long userId) {
        Optional<User> optionalUser = userRepository.findById(userId);
        User user = optionalUser.orElse(null);
        post.setOwner(user);
        postRepository.save(post);
    }

    public void downVote(long id, Long userId) {
        Optional<Post> optionalPost = postRepository.findById(id);
        Post post = optionalPost.orElse(null);
        Optional<User> optionalUser = userRepository.findById(userId);
        User user = optionalUser.orElse(null);
        assert post != null;
        post.downVote(user);
        postRepository.save(post);
    }


}
