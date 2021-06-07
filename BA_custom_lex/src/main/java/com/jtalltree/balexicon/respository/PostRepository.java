package com.jtalltree.balexicon.respository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.jtalltree.balexicon.models.Post;


public interface PostRepository extends JpaRepository<Post, Long>{
	
	List<Post> findAllByContentContains(String term);

}
