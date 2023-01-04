package io.github.mavaze.bookmyshow.contract.admin;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import io.github.mavaze.bookmyshow.dtos.MovieDTO;
import io.swagger.v3.oas.annotations.parameters.RequestBody;
import io.swagger.v3.oas.annotations.security.SecurityRequirement;
import reactivefeign.spring.config.ReactiveFeignClient;

@ReactiveFeignClient("admin-api")
@SecurityRequirement(name = "security_auth", scopes = { "admin" })
public interface MovieApi {

    // movie: addMovie(details, casts):movieId, deleteMovieById, updateMovie(cast)
    // cast: addCast, updateCast deleteCastById

    @GetMapping("/movies")
    List<MovieDTO> getMovies();

    @PostMapping("/movies")
    Integer addMovie(@RequestBody MovieDTO movie);
}
