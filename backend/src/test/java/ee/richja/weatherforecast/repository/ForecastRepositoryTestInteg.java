package ee.richja.weatherforecast.repository;

import com.fasterxml.jackson.core.JsonProcessingException;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import static org.junit.Assert.assertNotNull;

@RunWith(SpringRunner.class)
@SpringBootTest
public class ForecastRepositoryTestInteg {

    @Autowired
    ForecastRepository forecastRepository;

    @Test
    public void getWeatherForecast() throws JsonProcessingException {
        assertNotNull(forecastRepository.getWeatherForecast());
    }
}