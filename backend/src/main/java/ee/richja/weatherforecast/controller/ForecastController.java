package ee.richja.weatherforecast.controller;

import com.fasterxml.jackson.core.JsonProcessingException;
import ee.richja.weatherforecast.model.Forecast;
import ee.richja.weatherforecast.service.ForecastService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class ForecastController {
    @Autowired
    ForecastService forecastService;

    @GetMapping(value = "/forecast", produces = MediaType.APPLICATION_JSON_VALUE)
    public List<Forecast> getWeatherForecast() throws JsonProcessingException {
        return forecastService.getWeatherForecast().getForecast();
    }
}
