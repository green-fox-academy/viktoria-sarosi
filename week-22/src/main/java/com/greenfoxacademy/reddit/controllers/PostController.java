package com.greenfoxacademy.reddit.controllers;

import com.greenfoxacademy.reddit.services.PostService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

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
        return "redirect:index";
    }
}
