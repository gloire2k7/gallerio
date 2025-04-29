package com.rwandanart.gallery.service;

import com.rwandanart.gallery.model.Artwork;
import com.rwandanart.gallery.model.User;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.web.multipart.MultipartFile;

import java.util.List;
import java.util.Optional;

public interface ArtworkService {
    Artwork createArtwork(Artwork artwork, MultipartFile image);
    Artwork updateArtwork(Long id, Artwork artwork, MultipartFile image);
    void deleteArtwork(Long id);
    Optional<Artwork> getArtworkById(Long id);
    List<Artwork> getAllArtworks();
    Page<Artwork> getArtworksByFilters(String category, Double minPrice, Double maxPrice, String sortBy, Pageable pageable);
    List<Artwork> getArtworksByArtist(User artist);
    List<Artwork> getAvailableArtworks();
    List<Artwork> searchArtworks(String query);
    String uploadArtworkImage(MultipartFile file);
    void toggleArtworkAvailability(Long id);
    long getArtworkCount();
    long getArtworkCountByCategory(String category);
} 