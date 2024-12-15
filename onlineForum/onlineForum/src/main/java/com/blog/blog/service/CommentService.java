package com.blog.blog.service;

import com.blog.blog.dto.CommentDto;

import java.util.List;

public interface CommentService {
    void createComment(String url, CommentDto commentDto);
    List<CommentDto> findAllComments();
    void deleteComment(Long commentId);
    List<CommentDto> findCommentsByPost();
}
