package io.github.mavaze.bookmyshow.contract.vendor;

import java.util.Date;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestParam;

import io.github.mavaze.bookmyshow.dtos.MovieScheduleRequestDTO;
import io.github.mavaze.bookmyshow.dtos.ScreenRequestDTO;
import io.github.mavaze.bookmyshow.dtos.SeatMapRequestDTO;
import io.swagger.v3.oas.annotations.parameters.RequestBody;
import io.swagger.v3.oas.annotations.security.SecurityRequirement;
import reactivefeign.spring.config.ReactiveFeignClient;

@ReactiveFeignClient(name = "vendor-api")
// @ReactiveFeignClient(url = "http://vendor-api.{namespace}.svc.{cluster}.local:9090")
@SecurityRequirement(name = "security_auth", scopes = { "vendor" })
public interface MultiScreenApi {

    @PostMapping("/theaters/{theaterId}")
    Integer addScreenToTheater(@PathVariable Integer theaterId, @RequestBody ScreenRequestDTO screen);

    @DeleteMapping("/screens/{screenId}")
    boolean deleteScreen(@PathVariable String screenId);

    @GetMapping("/screens/{screenId}/shows")
    void getShowScheduleToScreen(@PathVariable Integer screenId, @RequestParam Date date);

    @PostMapping("/screens/{screenId}/shows")
    void addShowScheduleToScreen(@PathVariable Integer screenId, @RequestBody MovieScheduleRequestDTO screen);

    @PutMapping("/screens/{screenId}/shows")
    void updateMovieScheduleToScreen(@PathVariable String screenId, @RequestBody MovieScheduleRequestDTO screen);

    @GetMapping("/screens/{screenId}/seats")
    SeatMapRequestDTO addSeatMapToScreen(@PathVariable Integer screenId);

    @PostMapping("/screens/{screenId}/seats")
    void addSeatMapToScreen(@PathVariable Integer screenId, @RequestBody SeatMapRequestDTO screen);
}
