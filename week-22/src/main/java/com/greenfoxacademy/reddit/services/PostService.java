package com.greenfoxacademy.reddit.services;

import com.greenfoxacademy.reddit.models.entities.Post;
import com.greenfoxacademy.reddit.repositories.PostRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PostService {
    private PostRepository postRepository;

    @Autowired
    public PostService(PostRepository postRepository) {
        this.postRepository = postRepository;
    }

    public List<Post> findAllPosts() {
        return (List<Post>) postRepository.findAllByOrderByPointAsc();
    }


    public void upVote(long id){
        postRepository.findById(id).get().upVote();
    }

    public void submitNewPost(Post post) {
        postRepository.save(post);
    }
}