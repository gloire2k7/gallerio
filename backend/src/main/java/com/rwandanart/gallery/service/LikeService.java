package com.rwandanart.gallery.service;

import com.rwandanart.gallery.model.Like;
import com.rwandanart.gallery.model.Artwork;
import com.rwandanart.gallery.model.User;

import java.util.List;
import java.util.Optional;

public interface LikeService {
    Like toggleLike(User user, Artwork artwork);
    void deleteLike(Long id);
    Optional<Like> getLikeById(Long id);
    List<Like> getLikesByArtwork(Artwork artwork);
    List<Like> getLikesByUser(User user);
    boolean hasUserLikedArtwork(User user, Artwork artwork);
    long getLikeCount(Artwork artwork);
} 