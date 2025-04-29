package com.rwandanart.gallery.repository;

import com.rwandanart.gallery.model.Like;
import com.rwandanart.gallery.model.Artwork;
import com.rwandanart.gallery.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface LikeRepository extends JpaRepository<Like, Long> {
    Optional<Like> findByUserAndArtwork(User user, Artwork artwork);
    boolean existsByUserAndArtwork(User user, Artwork artwork);
    long countByArtwork(Artwork artwork);
} 