package android.ksigauke.com.undertheweather.repository;

import android.ksigauke.com.undertheweather.domain.Clouds;
import android.ksigauke.com.undertheweather.domain.Coordinates;
import android.ksigauke.com.undertheweather.domain.Forecast;
import android.ksigauke.com.undertheweather.domain.Main;
import android.ksigauke.com.undertheweather.domain.Sys;
import android.ksigauke.com.undertheweather.domain.Weather;
import android.ksigauke.com.undertheweather.domain.Wind;
import android.support.v4.util.Pair;

import java.util.Arrays;

/**
 * Created by KSigauke on 2017/05/04.
 */

public class InMemoryRepository implements ForecastRepository {

    private static final Forecast SUNNY_DAY;

    static {
        SUNNY_DAY = new Forecast.Builder()
                .id(1)
                .name("test city")
                .cod(200)
                .coordinates(new Coordinates(-26.1825267, 27.9976842))
                .weather(Arrays.asList(new Weather(1, "Clouds", "broken clouds", "")))
                .base("stations")
                .main(new Main(15.12, 1092, 32, 21.43, 30.12))
                .visibility(14490)
                .wind(new Wind(2.2, 240))
                .clouds(new Clouds(12))
                .dateRecorded(1493917980)
                .sys(new Sys(1, 129, 0.439, "ZA", 1493840983, 1493890335))
                .build();
    }

    @Override
    public void getForecast(Pair<Double, Double> latLong, GetForecastCallback callback) {
        callback.onForecastLoaded(SUNNY_DAY);
    }
}
