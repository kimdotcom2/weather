package com.weatherproject.weather.weatherAPI.VO;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@Getter
public class WeatherInputVO {
    private String serviceKey;
    private String numOfRows;
    private String pageNo;
    private String baseDate;
    private String baseTime;
    private String dataType;
    private String nx;
    private String ny;

    public WeatherInputVO(String serviceKey, String numOfRows, String pageNo, String baseDate, String baseTime, String dataType, String nx, String ny) {
        this.serviceKey = serviceKey;
        this.numOfRows = numOfRows;
        this.pageNo = pageNo;
        this.baseDate = baseDate;
        this.baseTime = baseTime;
        this.dataType = dataType;
        this.nx = nx;
        this.ny = ny;
    }
}
