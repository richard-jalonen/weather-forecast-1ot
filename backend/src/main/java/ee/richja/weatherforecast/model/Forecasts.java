package ee.richja.weatherforecast.model;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlElementWrapper;
import lombok.Data;

import java.util.List;

@Data
public class Forecasts {
    @JacksonXmlElementWrapper(useWrapping = false)
    List<Forecast> forecast;
}
