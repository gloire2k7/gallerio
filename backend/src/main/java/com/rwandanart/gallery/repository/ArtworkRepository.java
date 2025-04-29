package com.rwandanart.gallery.repository;

import com.rwandanart.gallery.model.Artwork;
import com.rwandanart.gallery.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ArtworkRepository extends JpaRepository<Artwork, Long> {
    List<Artwork> findByArtist(User artist);
    List<Artwork> findByCategory(Artwork.ArtworkCategory category);
    List<Artwork> findByIsAvailableTrue();
    List<Artwork> findByArtistAndIsAvailableTrue(User artist);
} 