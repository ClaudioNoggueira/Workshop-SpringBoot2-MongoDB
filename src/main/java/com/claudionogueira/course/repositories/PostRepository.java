package com.claudionogueira.course.repositories;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.claudionogueira.course.domain.Post;

@Repository
public interface PostRepository extends MongoRepository<Post, String> {

}
