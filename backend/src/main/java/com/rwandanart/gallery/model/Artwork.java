package com.rwandanart.gallery.model;

import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;
import java.util.Set;

@Entity
@Table(name = "artworks")
@Data
@NoArgsConstructor
public class Artwork {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String title;

    @Column(nullable = false, columnDefinition = "TEXT")
    private String description;

    @Column(nullable = false)
    private String imageUrl;

    @Column(nullable = false)
    private Double price;

    @Column(nullable = false)
    @Enumerated(EnumType.STRING)
    private ArtworkCategory category;

    @Column(nullable = false)
    private LocalDateTime createdAt;

    @Column(nullable = false)
    private boolean isAvailable;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "artist_id", nullable = false)
    private User artist;

    @OneToMany(mappedBy = "artwork", cascade = CascadeType.ALL)
    private Set<Comment> comments;

    @OneToMany(mappedBy = "artwork", cascade = CascadeType.ALL)
    private Set<Like> likes;

    @OneToMany(mappedBy = "artwork", cascade = CascadeType.ALL)
    private Set<Order> orders;

    @PrePersist
    protected void onCreate() {
        createdAt = LocalDateTime.now();
    }

    public enum ArtworkCategory {
        PAINTING,
        FASHION,
        CRAFT,
        SCULPTURE,
        PHOTOGRAPHY,
        OTHER
    }
} 