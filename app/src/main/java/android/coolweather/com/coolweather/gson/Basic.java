package android.coolweather.com.coolweather.gson;

import com.google.gson.annotations.SerializedName;

//城市基本信息
public class Basic {
    //由于JSON中某些字段不适合命名
    //适应注解来建立映射关系
    @SerializedName("city")
    public String cityName;

    @SerializedName("id")
    public String weatherId;

    public Update update;

    private class Update {
        @SerializedName("loc")
        public String updateTime;
    }
}
