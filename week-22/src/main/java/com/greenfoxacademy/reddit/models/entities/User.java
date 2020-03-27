package com.greenfoxacademy.reddit.models.entities;

import com.greenfoxacademy.reddit.models.dtos.Vote;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "User")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long userId;
    private String name;
    private String password;
    private String password2;
    @OneToMany(mappedBy = "owner", cascade = CascadeType.ALL)
    private List<Post> submittedPosts;
    @OneToMany
    private List <Vote> votes;

    public User() {
    }

    public User(String name, String password){
        this.name = name;
        this.password = password;
    }

    public String getPassword2() {
        return password2;
    }

    public void setPassword2(String password2) {
        this.password2 = password2;
    }

    public List<Post> getSubmittedPosts() {
        return submittedPosts;
    }

    public void setSubmittedPosts(List<Post> submittedPosts) {
        this.submittedPosts = submittedPosts;
    }

    public void addPost(Post post){
        submittedPosts.add(post);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Long getId() {
        return userId;
    }

    public void setId(Long userId) {
        this.userId = userId;
    }

    public List<Vote> getVotes() {
        return votes;
    }

    public void setVotes(List<Vote> votes) {
        this.votes = votes;
    }

    public void addVote(Vote vote){
        votes.add(vote);
    }
}
