package io.github.mavaze.bookmyshow.controllers;

import java.util.Date;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import io.github.mavaze.bookmyshow.contract.vendor.MultiScreenApi;
import io.github.mavaze.bookmyshow.dtos.MovieScheduleRequestDTO;
import io.github.mavaze.bookmyshow.dtos.ScreenRequestDTO;
import io.github.mavaze.bookmyshow.dtos.SeatMapRequestDTO;

@RestController
@RequestMapping("/api/vendor/v1")
public class MultiScreenController implements MultiScreenApi {

    @Override
    public Integer addScreenToTheater(Integer theaterId, ScreenRequestDTO screen) {
        return -1;
    }

    @Override
    public boolean deleteScreen(String screenId) {
        return false;
    }

    @Override
    public void getShowScheduleToScreen(Integer screenId, Date date) {

    }

    @Override
    public void addShowScheduleToScreen(Integer screenId, MovieScheduleRequestDTO screen) {

    }

    @Override
    public void updateMovieScheduleToScreen(String screenId, MovieScheduleRequestDTO screen) {

    }

    @Override
    public SeatMapRequestDTO addSeatMapToScreen(Integer screenId) {
        return null;
    }

    @Override
    public void addSeatMapToScreen(Integer screenId, SeatMapRequestDTO screen) {

    }
}
