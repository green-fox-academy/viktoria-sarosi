package com.greenfoxacademy.reddit.services;

import com.greenfoxacademy.reddit.models.entities.Vote;
import com.greenfoxacademy.reddit.models.entities.Post;
import com.greenfoxacademy.reddit.models.entities.User;
import com.greenfoxacademy.reddit.repositories.PostRepository;
import com.greenfoxacademy.reddit.repositories.UserRepository;
import com.greenfoxacademy.reddit.repositories.VoteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class PostService {
    private PostRepository postRepository;
    private UserRepository userRepository;
    private VoteRepository voteRepository;

    @Autowired
    public PostService(PostRepository postRepository, UserRepository userRepository, VoteRepository voteRepository) {
        this.postRepository = postRepository;
        this.userRepository = userRepository;
        this.voteRepository = voteRepository;
    }

    public List<Post> findAllPosts() {
        return (List<Post>) postRepository.findAllByOrderByPointDesc();
    }


    public void upVote(long id, long userId) {
        Optional<Post> optionalPost = postRepository.findById(id);
        Post post = optionalPost.orElse(null);
        Optional<User> optionalUser = userRepository.findById(userId);
        User user = optionalUser.orElse(null);
        if (post != null && user != null) {
            Vote vote = new Vote(post, user, 1);
            Optional<Vote> optionalVote = voteRepository.findByPostAndUser(post, user);
            if (!optionalVote.isPresent()) {
                post.upVote(1);
                postRepository.save(post);
                voteRepository.save(vote);
            }else if (optionalVote.get().getVote() == -1){
                post.upVote(2);
                postRepository.save(post);
                vote.setVoteId(optionalVote.get().getVoteId());
                voteRepository.save(vote);
            }
        }
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
        if (post != null & user != null) {
            Vote vote = new Vote(post, user, -1);
            Optional<Vote> optionalVote = voteRepository.findByPostAndUser(post, user);
            if (!optionalVote.isPresent()) {
                post.downVote(1);
                postRepository.save(post);
                voteRepository.save(vote);
            }else if (optionalVote.get().getVote() == 1){
                post.downVote(2);
                postRepository.save(post);
                vote.setVoteId(optionalVote.get().getVoteId());
                voteRepository.save(vote);
            }
        }
    }
}
