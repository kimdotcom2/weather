package com.weatherproject.weather.weatherAPI.service;

import com.weatherproject.weather.weatherAPI.VO.WeatherInputVO;

public interface UriBuilderService {

    public String urlBuild(WeatherInputVO weatherInputVO);
}
