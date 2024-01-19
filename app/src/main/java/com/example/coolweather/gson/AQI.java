package com.example.coolweather.gson;

/**
 * AQI类为和风天气返回的数据中的一个实体类
 * "aqi":{
 * "city":{
 * "aqi":"44",
 * "pm25":"13"
 * }
 * }
 */
public class AQI {
    public AQICity city;

    public class AQICity {
        public String aqi;
        public String pm25;
    }
}
