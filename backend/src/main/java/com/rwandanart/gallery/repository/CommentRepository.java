package com.rwandanart.gallery.repository;

import com.rwandanart.gallery.model.Comment;
import com.rwandanart.gallery.model.Artwork;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CommentRepository extends JpaRepository<Comment, Long> {
    List<Comment> findByArtwork(Artwork artwork);
    List<Comment> findByArtworkOrderByCreatedAtDesc(Artwork artwork);
} 