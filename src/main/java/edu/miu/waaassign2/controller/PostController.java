package edu.miu.waaassign2.controller;

import edu.miu.waaassign2.entity.Post;
import edu.miu.waaassign2.entity.Users;
import edu.miu.waaassign2.service.PostService;
import edu.miu.waaassign2.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/v1/posts")
public class PostController {

    @Autowired
    private PostService postService;

    @GetMapping

    public Iterable<Post> getAllPosts(){
        return postService.findAllPost();
    }

    @PostMapping
    public void save(@RequestBody Post post){
        postService.save(post);
    }

    @GetMapping("/{id}")
    public Post getPostById(@PathVariable long id){
       return postService.getById(id);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable long id){
        postService.delete(id);
    }
}
