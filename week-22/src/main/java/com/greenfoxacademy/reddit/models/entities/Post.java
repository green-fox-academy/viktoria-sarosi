package com.greenfoxacademy.reddit.models.entities;



import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "Post")
public class Post {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String title;
    private String url;
    private int point;
    @ManyToOne
    private User owner;
    @OneToMany(mappedBy = "post", cascade = CascadeType.ALL)
    private List<Vote> votes;

    public Post() {
    }

    public Post(String title) {
        this.title = title;
    }

    public Post(String title, String url) {
        this.title = title;
        this.url = url;
    }

    public int getPoint() {
        return point;
    }

    public User getOwner() {
        return owner;
    }

    public void setOwner(User owner) {
        this.owner = owner;
    }

    public void setPoint(int point) {
        this.point = point;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public void upVote(int n) {
        point += n;
    }
    public void downVote(int n) {
        point -= n;
    }

    public List<Vote> getVotes() {
        return votes;
    }

    public void setVotes(List<Vote> votes) {
        this.votes = votes;
    }
     public void add(Vote vote){
        votes.add(vote);
     }
}
