package com.movies_api.controllers;

import com.movies_api.dto.CreateMovieDto;
import com.movies_api.entities.Movie;
import com.movies_api.services.MoviesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/movies")
public class MoviesController {
    @Autowired
    private MoviesService moviesService;

    @PostMapping
    public ResponseEntity<Long> create(@RequestBody CreateMovieDto dto) {
        Long movie = this.moviesService.create(dto);

        return ResponseEntity.status(201).body(movie);
    }
}
