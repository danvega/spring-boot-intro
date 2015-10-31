package com.toysforshots.controller;

import com.toysforshots.domain.Post;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;
import java.util.Date;


@Controller
@RequestMapping("/posts")
public class PostController {

    @RequestMapping("/")
    public String list(Model model){
        model.addAttribute("pageTitle","My Custom Page Title");
        model.addAttribute("posts",createPosts());
        return "views/list";
    }


    private ArrayList<Post> createPosts(){
        // post 1
        Post post1 = new Post();
        post1.setTitle("My Blog Post 1");
        post1.setPosted(new Date());
        post1.setAuthor("Dan Vega");
        post1.setBody(getPostBody());

        // post 2
        Post post2 = new Post();
        post2.setTitle("My Blog Post 2");
        post2.setPosted(new Date());
        post2.setAuthor("Dan Vega");
        post2.setBody("<p>This post didn't take long to write.");

        ArrayList<Post> posts = new ArrayList<Post>();
        posts.add(post1);
        posts.add(post2);

        return posts;
    }

    private String getPostBody(){
        String body = "<p>Lorem ipsum dolor sit amet, consectetur adipiscing elit. In ac finibus mi. Morbi porttitor urna dui, sed volutpat justo rutrum sit amet. Etiam elementum lacus eget malesuada egestas. Sed id lectus arcu. Pellentesque molestie dignissim diam non commodo. Nunc nec aliquet lectus. Ut a accumsan sapien. Pellentesque sit amet sem nisl. Nulla fringilla vulputate mauris, eleifend dapibus libero. Sed eu cursus orci. In hac habitasse platea dictumst. Vestibulum vel vulputate ex. Nam gravida blandit nisl, at luctus mi interdum ut. Pellentesque et pharetra mi. Proin id placerat diam. Ut porttitor risus in leo tincidunt, a iaculis velit maximus.</p>";
        body += "<p>Nunc bibendum sollicitudin ex, vitae lobortis nunc malesuada eget. Maecenas aliquam aliquam elit, nec rutrum justo blandit sit amet. Cras pellentesque egestas nisi at egestas. Donec lacus ipsum, dignissim a accumsan quis, rutrum ac massa. Vivamus sed dolor nisl. Integer convallis, elit sed euismod molestie, purus velit ornare justo, ac maximus diam odio id felis. Maecenas auctor sed quam ac aliquet. Curabitur tempus sed purus sit amet blandit.</p>";
        body += "<p>Curabitur eget arcu elementum, pulvinar odio ut, dictum tellus. In hac habitasse platea dictumst. Proin sagittis a ex id tempor. Proin faucibus risus non pellentesque vulputate. Morbi augue sem, finibus non leo ut, fermentum auctor massa. Mauris nisi felis, posuere ut efficitur eu, gravida nec enim. Curabitur tempus id nulla in iaculis. Mauris varius accumsan nunc ut pellentesque. Sed placerat vel nisl quis ornare. Ut imperdiet felis et massa facilisis, vel vestibulum erat varius. Etiam tristique dignissim leo, congue tincidunt mi finibus vitae. Suspendisse quis risus eget arcu pharetra tincidunt eu non sapien. Cras sollicitudin, lectus non venenatis ullamcorper, eros quam condimentum libero, nec fermentum purus neque eu eros. Nullam eget blandit nunc. Mauris ultricies sed sapien non aliquam. Etiam bibendum lectus scelerisque neque eleifend, non semper nisi condimentum.</p>";
        return body;
    }
}
