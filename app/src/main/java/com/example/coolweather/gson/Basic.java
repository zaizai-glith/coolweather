package com.example.coolweather.gson;

import com.google.gson.annotations.SerializedName;

/**
 * Basic类为和风天气返回的数据中的一个实体类
 * "basic":{
 * "city":"苏州",
 * "id":"CN101190401",
 * "update":{
 * "loc":"2016-08-08 21:58"
 * }
 * }
 */
public class Basic {
    @SerializedName("city")
    public String cityName;

    @SerializedName("id")
    public String weatherId;

    public Update update;

    public class Update {
        @SerializedName("loc")
        public String updateTime;
    }
}
