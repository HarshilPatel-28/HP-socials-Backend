package com.harshil.service;

import java.time.LocalDateTime;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.harshil.models.Comment;
import com.harshil.models.Post;
import com.harshil.models.User;
import com.harshil.repository.CommentRepository;
import com.harshil.repository.PostRepository;

@Service
public class CommentServiceImplementation implements CommentService {
	
	@Autowired
	private PostService postService;

	@Autowired
	private UserService userService;
	
	@Autowired
	private CommentRepository commentRepository;
	
	@Autowired
	private PostRepository postRepository;
	
	
	
	@Override
	public Comment createComments(Comment comment, Integer postId, Integer userId) throws Exception {
		User user=userService.findUserById(userId);
		
		Post post = postService.findPostById(postId);
		
		comment.setUser(user);
		comment.setcontent(comment.getcontent());
		comment.setcreatedAt(LocalDateTime.now());
		
		Comment savedComment = commentRepository.save(comment);
		
		post.getComments().add(savedComment);
		
		postRepository.save(post);
		
		return savedComment;
	}

	@Override
	public Comment findCommentById(Integer commentId) throws Exception {
		Optional<Comment> optComment=commentRepository.findById(commentId);
		
		if (optComment.isEmpty()) {
			throw new Exception("comment not exist!");
		}
		
		return optComment.get();
	}

	@Override
	public Comment likeComment(Integer CommentId, Integer userId) throws Exception {
		Comment comment = findCommentById(CommentId);
		User user = userService.findUserById(userId);
		
		if(!comment.getLiked().contains(user)) {
			comment.getLiked().add(user);
		}
		else {
			comment.getLiked().remove(user);
		}
		return commentRepository.save(comment);
	}

}
