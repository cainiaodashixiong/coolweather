package android.coolweather.com.coolweather.gson;


import com.google.gson.annotations.SerializedName;

//天气信息
public class Now {
    @SerializedName("tmp")
    public String temperature;

    @SerializedName("cond")
    public  More more;

    private class More {
        @SerializedName("txt")
        public String info;
    }
}