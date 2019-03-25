package android.coolweather.com.coolweather.gson;

//天气质量
public class AQI {
    public  AQICity city;

    private class AQICity {
        public String aqi;
        public String pm25;
    }
}
