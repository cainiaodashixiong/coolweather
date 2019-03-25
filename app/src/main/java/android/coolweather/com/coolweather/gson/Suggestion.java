package android.coolweather.com.coolweather.gson;


import com.google.gson.annotations.SerializedName;

//建议
public class Suggestion {
    @SerializedName("comf")
    public Comfort comfort;

    @SerializedName("cw")
    public Carwash carwash;

    public Sport sport;

    private class Comfort {
        @SerializedName("txt")
        public String info;
    }

    private class Carwash {
        @SerializedName("txt")
        public String info;
    }

    private class Sport {
        @SerializedName("txt")
        public String info;
    }
}
