package com.movies_api.services;

import com.movies_api.dto.CreateMovieDto;
import com.movies_api.entities.Movie;
import com.movies_api.repositories.MoviesRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MoviesService {
    @Autowired
    private MoviesRepository moviesRepository;

    public Long create(CreateMovieDto dto) {
        Movie movie = new Movie(
                null,
                dto.getTitle(),
                dto.getSynopsis(),
                dto.getImage(),
                dto.getGenre(),
                dto.getDirector(),
                dto.getRelease_date());

        Movie data = this.moviesRepository.save(movie);

        return data.getId();
    }
}
