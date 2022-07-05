package com.weatherproject.weather.weatherAPI.controller;

import com.weatherproject.weather.weatherAPI.VO.WeatherInputVO;
import com.weatherproject.weather.weatherAPI.config.WeatherConfig;
import com.weatherproject.weather.weatherAPI.service.UriBuilderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class WeatherController {

    ApplicationContext ac = new AnnotationConfigApplicationContext(WeatherConfig.class);

    public UriBuilderService uriBuilderService = ac.getBean("uriBuilderService", UriBuilderService.class);

    @Autowired
    public WeatherController(UriBuilderService uriBuilderService) {
        this.uriBuilderService = uriBuilderService;
    }

    @GetMapping("/weather")
    public String weather() {
        return "weather/weather";
    }

    @PostMapping("/weather/view")
    public String weatherView(WeatherInputVO weatherInputVO) {

        String url = uriBuilderService.urlBuild(weatherInputVO);

        return url;

    }
}
