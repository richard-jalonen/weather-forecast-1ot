package ee.richja.weatherforecast.service;

import com.fasterxml.jackson.core.JsonProcessingException;
import ee.richja.weatherforecast.model.Forecasts;
import ee.richja.weatherforecast.repository.ForecastRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ForecastService {
    @Autowired
    ForecastRepository forecastRepository;

    public Forecasts getWeatherForecast() throws JsonProcessingException {
        return forecastRepository.getWeatherForecast();
    }
}
