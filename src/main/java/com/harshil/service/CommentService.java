package com.harshil.service;

import com.harshil.models.Comment;


public interface CommentService {
	public Comment createComments(Comment comment,Integer postId,Integer userId) throws Exception;
	
	public Comment findCommentById(Integer commentId) throws Exception;
	
	public Comment likeComment(Integer CommentId,Integer userId) throws Exception;
}
