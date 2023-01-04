package io.github.mavaze.bookmyshow.contract.admin;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;

import io.github.mavaze.bookmyshow.dtos.ScreenRequestDTO;
import io.github.mavaze.bookmyshow.dtos.TheaterRequestDTO;
import io.swagger.v3.oas.annotations.security.SecurityRequirement;
import reactivefeign.spring.config.ReactiveFeignClient;

@ReactiveFeignClient("admin-api")
@SecurityRequirement(name = "security_auth", scopes = { "admin" })
public interface TheaterApi {

    // city: addCity, listCities
    // theater: addTheater(city, screens):theaterId, addScreenToTheater:boolean, deleteScreenFromTheater:boolean

    @GetMapping("/cities")
    List<String> getCities();

    @PostMapping("/cities")
    Integer addCity(@RequestBody String city);

    @GetMapping(value = "/cities/{city}/theaters", produces = "application/json")
    List<Object> getTheatersByCity(@PathVariable String city);

    @PostMapping("/cities/{city}/theaters")
    Integer addTheater(@PathVariable String city, @RequestBody TheaterRequestDTO theater);

    @PutMapping("/theaters/{theaterId}")
    Integer addScreenToTheater(@PathVariable Integer theaterId, @RequestBody ScreenRequestDTO screen);

}
