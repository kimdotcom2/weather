package com.weatherproject.weather.weatherAPI.config;

import com.weatherproject.weather.weatherAPI.VO.WeatherInputVO;
import com.weatherproject.weather.weatherAPI.service.UriBuilderService;
import com.weatherproject.weather.weatherAPI.service.UriBuilderServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class WeatherConfig {

    private final WeatherInputVO weatherInputVO;

    @Autowired
    public WeatherConfig(WeatherInputVO weatherInputVO) {
        this.weatherInputVO = weatherInputVO;
    }

    @Bean
    public UriBuilderService uriBuilderService(WeatherInputVO weatherInputVO) {
        return new UriBuilderServiceImpl(weatherInputVO);
    }
}
