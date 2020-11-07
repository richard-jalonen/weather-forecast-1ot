package ee.richja.weatherforecast.repository;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.dataformat.xml.XmlMapper;
import ee.richja.weatherforecast.model.Forecast;
import ee.richja.weatherforecast.model.Forecasts;
import org.springframework.stereotype.Repository;
import org.springframework.web.client.RestTemplate;

@Repository
public class ForecastRepository {
    private static final String FORECAST_XML_URL = "https://www.ilmateenistus.ee/ilma_andmed/xml/forecast.php?lang=eng";

    public Forecasts getWeatherForecast() throws JsonProcessingException {
        String forecastXmlAsString = new RestTemplate().getForObject(FORECAST_XML_URL, String.class);
        return new XmlMapper().readValue(forecastXmlAsString, Forecasts.class);
    }
}
