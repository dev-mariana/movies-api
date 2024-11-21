package com.movies_api.dto;



import java.util.Date;

public class CreateMovieDto {
    private String title;
    private String synopsis;
    private String image;
    private String genre;
    private String director;
    private Date release_date;

    public CreateMovieDto(String title, String synopsis, String image, String genre, String director, Date release_date) {
        this.title = title;
        this.synopsis = synopsis;
        this.image = image;
        this.genre = genre;
        this.director = director;
        this.release_date = release_date;
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
