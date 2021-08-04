package com.codingdojo.repasoexamen.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.codingdojo.repasoexamen.models.Comment;

@Repository
public interface CommentRepository extends CrudRepository<Comment, Long> {

}
