package com.rwandanart.gallery.service;

import com.rwandanart.gallery.model.Comment;
import com.rwandanart.gallery.model.Artwork;
import com.rwandanart.gallery.model.User;

import java.util.List;
import java.util.Optional;

public interface CommentService {
    Comment createComment(Comment comment);
    Comment updateComment(Long id, Comment comment);
    void deleteComment(Long id);
    Optional<Comment> getCommentById(Long id);
    List<Comment> getCommentsByArtwork(Artwork artwork);
    List<Comment> getCommentsByUser(User user);
    long getCommentCount(Artwork artwork);
} 