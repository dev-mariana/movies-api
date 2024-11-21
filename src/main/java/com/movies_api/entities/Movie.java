package com.movies_api.entities;

import jakarta.persistence.*;

import java.util.Date;

@Entity
@Table(name = "movies")
public class Movie {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false, length = 255)
    private String title;

    @Column(nullable = true, columnDefinition = "TEXT")
    private String synopsis;

    @Column(nullable = false, length = 255)
    private String image;

    @Column(nullable = false, length = 255)
    private String genre;

    @Column(nullable = false, length = 255)
    private String director;

    @Column(nullable = true, length = 255)
    private Date release_date;

    public Movie(Long id, String title, String synopsis, String image, String genre, String director, Date release_date) {
        this.id = id;
        this.title = title;
        this.synopsis = synopsis;
        this.image = image;
        this.genre = genre;
        this.director = director;
        this.release_date = release_date;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getSynopsis() {
        return synopsis;
    }

    public void setSynopsis(String synopsis) {
        this.synopsis = synopsis;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    public Date getRelease_date() {
        return release_date;
    }

    public void setRelease_date(Date release_date) {
        this.release_date = release_date;
    }
}
