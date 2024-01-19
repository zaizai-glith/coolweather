package com.example.coolweather.gson;

import com.google.gson.annotations.SerializedName;

/**
 * Now类为和风天气返回的数据中的一个实体类
 * "now":{
 * "tmp":"29",
 * "cond":{
 * "txt":"阵雨"
 * }
 * }
 */
public class Now {
    @SerializedName("tmp")
    public String temperature;

    @SerializedName("cond")
    public More more;

    public class More {
        @SerializedName("txt")
        public String info;
    }
}
