package com.coolweather.android.gson;

import com.google.gson.annotations.SerializedName;

public class Forecast {

    public String date;//预报日期
    @SerializedName("tmp")
    public Temperature temperature;
    @SerializedName("cond")
    public More more;
    public class Temperature{

        public String max;//最高温度

        public String min;//最低温度

    }
    public class More{

        @SerializedName("txt_d")
        public String info;
    }



}
