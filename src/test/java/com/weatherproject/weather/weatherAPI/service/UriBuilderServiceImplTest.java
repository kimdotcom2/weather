package com.weatherproject.weather.weatherAPI.service;

import com.weatherproject.weather.weatherAPI.VO.WeatherInputVO;
import com.weatherproject.weather.weatherAPI.config.WeatherConfig;
import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;


class UriBuilderServiceImplTest {

    @Test
    void urlTest() {

        WeatherInputVO weatherInputVO = new WeatherInputVO("nSmfjRDZ%2BV50faXQDrWwUeedWar2l0UM5KkCehAPcH%2BwjUF%2FR362qlgBd1mYU9xBIauT11l5O5OWvlCDS9PrqQ%3D%3D",
                "13",
                "1",
                "20220705",
                "1400",
                "JSON",
                "61",
                "120"
        );

        ApplicationContext ac = new AnnotationConfigApplicationContext(WeatherConfig.class);

        //UriBuilderService uriBuilderService = new UriBuilderServiceImpl(weatherInputVO);

        //String result = uriBuilderService.urlBuild(weatherInputVO);
        //System.out.println(result);
    }

}