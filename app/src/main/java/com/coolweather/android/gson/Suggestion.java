package com.coolweather.android.gson;

import com.google.gson.annotations.SerializedName;

public class Suggestion {

    @SerializedName("comf")
    public Comfort comfort;//舒适度

    public class Comfort{

        @SerializedName("txt")
        public String info;

    }

    @SerializedName("cw")
    public CarWash carWash;//洗车建议

    public class CarWash{

        @SerializedName("txt")
        public String info;
    }


    public Sport sport;//运动建议

    public class Sport{

        @SerializedName("txt")
        public String info;
    }

}


