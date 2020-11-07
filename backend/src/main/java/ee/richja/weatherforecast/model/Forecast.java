package ee.richja.weatherforecast.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

@Data
public class Forecast {
    String date;
    ForecastBase night;
    ForecastBase day;
}

@Data
@JsonIgnoreProperties(ignoreUnknown = true)
class ForecastBase {
    String phenomenon;
    @JsonProperty("tempmin")
    int tempMin;
    @JsonProperty("tempmax")
    int tempMax;
    String text;
}
