package io.github.mavaze.bookmyshow.contract.admin;

import io.swagger.v3.oas.annotations.security.SecurityRequirement;
import reactivefeign.spring.config.ReactiveFeignClient;

@ReactiveFeignClient("admin-api")
@SecurityRequirement(name = "security_auth", scopes = { "admin" })
public interface TheaterApi {

    // city: addCity, listCities
    // theater: addTheater(city, screens):theaterId, addScreenToTheater:boolean, deleteScreenFromTheater:boolean
    // movie: addMovie(details, casts):movieId, deleteMovieById, updateMovie(cast)
    // cast: addCast, updateCast deleteCastById

}
