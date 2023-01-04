package io.github.mavaze.bookmyshow.controllers;

import java.util.Collections;
import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import io.github.mavaze.bookmyshow.contract.admin.TheaterApi;
import io.github.mavaze.bookmyshow.dtos.ScreenRequestDTO;
import io.github.mavaze.bookmyshow.dtos.TheaterRequestDTO;

@RestController
@RequestMapping("/api/admin/v1")
public class TheaterController implements TheaterApi {

    @Override
    public List<String> getCities() {
        return Collections.emptyList();
    }

    @Override
    public Integer addCity(String city) {
        return -1;
    }

    @Override
    public List<Object> getTheatersByCity(String city) {
        return Collections.emptyList();
    }

    @Override
    public Integer addTheater(String city, TheaterRequestDTO theater) {
        return -1;
    }

    @Override
    public Integer addScreenToTheater(Integer theaterId, ScreenRequestDTO screen) {
        return -1;
    }
}
