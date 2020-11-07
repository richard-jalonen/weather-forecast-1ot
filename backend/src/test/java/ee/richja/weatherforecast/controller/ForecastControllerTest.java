package ee.richja.weatherforecast.controller;

import ee.richja.weatherforecast.model.Forecast;
import ee.richja.weatherforecast.model.Forecasts;
import ee.richja.weatherforecast.service.ForecastService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.http.MediaType;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;

import java.util.ArrayList;
import java.util.List;

import static org.mockito.Mockito.when;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.jsonPath;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@RunWith(SpringRunner.class)
@WebMvcTest(ForecastController.class)
public class ForecastControllerTest {
    @MockBean
    ForecastService forecastService;
    @Autowired
    private MockMvc mockMvc;

    @Test
    public void getWeatherForecast() throws Exception {
        Forecast forecast = new Forecast();
        forecast.setDate("2020-11-07");
        List<Forecast> forecastList = new ArrayList<>();
        forecastList.add(forecast);
        Forecasts forecasts = new Forecasts();
        forecasts.setForecast(forecastList);

        when(forecastService.getWeatherForecast()).thenReturn(forecasts);

        mockMvc.perform(get("/forecast")
                .contentType(MediaType.APPLICATION_JSON))
                .andExpect(status().isOk())
                .andExpect(jsonPath("$[*].date").value(forecast.getDate()));
    }
}