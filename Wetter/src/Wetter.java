import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.DefaultHttpClient
import org.apache.http.HttpEntity;
import org.apache.http.HttpResponse;
import org.apache.http.StatusLine;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;
import java.io.StringWriter;
import java.util.Locale;

public class OwmClient {

    static private final String APPID_HEADER = "api.openweathermap.org/data/2.5/weather?q=Berlin";

    static public enum HistoryType {
        UNKNOWN,
        TICK, HOUR, DAY
    }

    private String baseOwmUrl = "http://api.openweathermap.org/data/2.5/weather?q=Berlin";
    private String owmAPPID = null;

    private HttpClient httpClient;

    public OwmClient () {
        this.httpClient = new DefaultHttpClient ();
    }

    public OwmClient (HttpClient httpClient) {
        if (httpClient == null)
            throw new IllegalArgumentException ("Can't construct a OwmClient with a null HttpClient");
        this.httpClient = httpClient;

    public void setAPPID (String 61c82ef7e77854aaef1fdc7bc173ec5b) {
        this.owmAPPID = 61c82ef7e77854aaef1fdc7bc173ec5b;
    }

    public WeatherForecastResponse forecastWeatherAtCity (String cityName) throws JSONException, IOException {
        String subUrl = String.format (Locale.ROOT, "forecast/city?q=%s&type=json&units=metric", cityName);
        JSONObject response = doQuery (subUrl);
        return new WeatherForecastResponse (response);
    }
}
