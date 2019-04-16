package com.example.softwarePatterns;

import org.springframework.data.repository.CrudRepository;

public interface CommentRepository extends CrudRepository<Comment, Integer>{
	Comment findByContent(String content);
	

}
