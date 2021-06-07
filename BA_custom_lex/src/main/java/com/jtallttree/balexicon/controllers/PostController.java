package com.jtallttree.balexicon.controllers;

import java.util.Collections;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.jtalltree.balexicon.models.Post;
import com.jtalltree.balexicon.respository.PostRepository;

@Controller
public class PostController {
	
	private final PostRepository postDao;
	
	public PostController(PostRepository postDao) {
        this.postDao = postDao;
        
    }
	
	@GetMapping("/posts")
    public String allPosts(Model vModel) {
        List<Post> postsFromDB = postDao.findAll();
        Collections.sort(postsFromDB, Collections.reverseOrder());
        vModel.addAttribute("posts", postsFromDB);
        return "index";
    }
	
	 @PostMapping("/posts/search")
	    public String searchPosts(@RequestParam(name = "word") String term, Model vModel) {
	        vModel.addAttribute("posts", postDao.findAllByContentContains(term));
	        vModel.addAttribute("word", term);
	        return "index";
	    }
}
