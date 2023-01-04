package io.github.mavaze.bookmyshow.controllers;

import java.util.Collections;
import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import io.github.mavaze.bookmyshow.contract.admin.MovieApi;
import io.github.mavaze.bookmyshow.dtos.MovieDTO;

@RestController
@RequestMapping("/api/admin/v1")
public class MovieController implements MovieApi {

    @Override
    public List<MovieDTO> getMovies() {
        return Collections.emptyList();
    }

    @Override
    public Integer addMovie(MovieDTO movie) {
        return -1;
    }
}
