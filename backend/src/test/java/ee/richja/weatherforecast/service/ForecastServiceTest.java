package ee.richja.weatherforecast.service;

import com.fasterxml.jackson.core.JsonProcessingException;
import ee.richja.weatherforecast.model.Forecast;
import ee.richja.weatherforecast.model.Forecasts;
import ee.richja.weatherforecast.repository.ForecastRepository;
import org.junit.Before;
import org.junit.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.when;

public class ForecastServiceTest {
    @Mock
    ForecastRepository forecastRepository;
    @InjectMocks
    ForecastService forecastService;

    @Before
    public void setup() {
        MockitoAnnotations.initMocks(this);
    }

    @Test
    public void getWeatherForecast() throws JsonProcessingException {
        Forecast forecast = new Forecast();
        forecast.setDate("2020-11-07");
        List<Forecast> forecastList = new ArrayList<>();
        forecastList.add(forecast);
        Forecasts forecasts = new Forecasts();
        forecasts.setForecast(forecastList);

        when(forecastRepository.getWeatherForecast()).thenReturn(forecasts);

        assertEquals(forecasts, forecastService.getWeatherForecast());
    }
}