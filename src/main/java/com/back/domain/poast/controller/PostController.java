package com.back.domain.poast.controller;

import com.back.domain.poast.entity.Post;
import com.back.domain.poast.service.PostService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class PostController {

    private final PostService postService;

    public PostController(PostService postService) {
        this.postService = postService;
    }

    @GetMapping("/posts/writeForm")
    @ResponseBody
    public String writeFrom() {

        return """
                <form action="/posts/write">
                  <input type="text" name="title">
                  <br>
                  <textarea name="content"></textarea>
                  <br>
                  <input type="submit" value="작성">
                </form>
                """;
    }
    @GetMapping("/posts/write")
    @ResponseBody
    public String wrtie(String title, String content){
        Post post = postService.write(title,content);
        return "%d번 글이 작성되었습니다.".formatted(post.getId());
    }
}
