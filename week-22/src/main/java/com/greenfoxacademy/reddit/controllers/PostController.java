package com.greenfoxacademy.reddit.controllers;

import com.greenfoxacademy.reddit.models.entities.Post;
import com.greenfoxacademy.reddit.services.PostService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
public class PostController {

    private PostService postService;

    @Autowired
    public PostController(PostService postService) {
        this.postService = postService;
    }

    @RequestMapping(value = {"/"}, method = RequestMethod.GET)
    public String renderPostList(Model model) {
        model.addAttribute("posts", postService.findAllPosts());
        return "index";
    }

    @GetMapping("/{id}/up")
    public String upVote(@PathVariable(value = "id", required = false) long id) {
        postService.upVote(id);
        return "redirect:/";
    }

    @GetMapping("/{id}/down")
    public String downVote(@PathVariable(value = "id", required = false) long id) {
        postService.downVote(id);
        return "redirect:/";
    }
    @GetMapping("submit")
    public String renderSubmit(Model model, @ModelAttribute("post") Post post) {
        model.addAttribute("post", post);
        return "submit";
    }

    @PostMapping("submit")
    public String SubmitNewPost(@ModelAttribute("post") Post post) {
        postService.submitNewPost(post);
        return "redirect:/";
    }
}
