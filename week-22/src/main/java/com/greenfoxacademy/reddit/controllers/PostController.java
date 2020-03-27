package com.greenfoxacademy.reddit.controllers;

import com.greenfoxacademy.reddit.models.entities.Post;
import com.greenfoxacademy.reddit.models.entities.User;
import com.greenfoxacademy.reddit.services.PostService;
import com.greenfoxacademy.reddit.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
public class PostController {

    private PostService postService;
    private UserService userService;

    @Autowired
    public PostController(PostService postService, UserService userService) {
        this.postService = postService;
        this.userService = userService;
    }

    @RequestMapping(value = {"/{userId}"}, method = RequestMethod.GET)
    public String renderPostList(Model model, @PathVariable(name = "userId", required = false) Long userId) {
        model.addAttribute("posts", postService.findAllPosts());
        model.addAttribute("user", userService.findUserByUserId(userId));
        return "index";
    }

    @GetMapping("/{id}/up/{userId}")
    public String upVote(@PathVariable(value = "id", required = false) Long id, @PathVariable(value = "userId", required = false) Long userId) {
        postService.upVote(id, userId);
        return "redirect:/{userId}";
    }

    @GetMapping("/{id}/down/{userId}")
    public String downVote(@PathVariable(value = "id", required = false) Long id, @PathVariable(value = "userId", required = false) Long userId) {
        postService.downVote(id, userId);
        return "redirect:/{userId}";
    }

    @GetMapping("submit/{userId}")
    public String renderSubmit(Model model, @PathVariable(name = "userId", required = false) Long userId) {
        model.addAttribute("post", new Post());
        model.addAttribute("userId", userId);
        return "submit";
    }

    @PostMapping("submit/{userId}")
    public String SubmitNewPost(@ModelAttribute Post post, @PathVariable (name = "userId", required = false) Long userId) {
        postService.submitNewPost(post, userId);
        return "redirect:/{userId}";
    }
}
