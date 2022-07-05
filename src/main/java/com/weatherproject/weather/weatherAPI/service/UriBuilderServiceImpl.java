package com.weatherproject.weather.weatherAPI.service;

import com.weatherproject.weather.weatherAPI.VO.WeatherInputVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.util.UriComponentsBuilder;

@Service
public class UriBuilderServiceImpl implements UriBuilderService{

    private final WeatherInputVO weatherInputVO;

    @Autowired
    public UriBuilderServiceImpl(WeatherInputVO weatherInputVO) {
        this.weatherInputVO = weatherInputVO;
    }

    @Override
    public String urlBuild(WeatherInputVO weatherInputVO) {
        UriComponentsBuilder builder = UriComponentsBuilder.fromPath("https://apis.data.go.kr/1360000/VilageFcstInfoService_2.0/getVilageFcst")
                .queryParam("serviceKey", this.weatherInputVO.getServiceKey())
                .queryParam("numOfRows", this.weatherInputVO.getNumOfRows())
                .queryParam("pageNo", this.weatherInputVO.getPageNo())
                .queryParam("base_date", this.weatherInputVO.getBaseDate())
                .queryParam("base_time", this.weatherInputVO.getBaseTime())
                .queryParam("dataType", this.weatherInputVO.getDataType())
                .queryParam("nx", this.weatherInputVO.getNx())
                .queryParam("ny", this.weatherInputVO.getNy());

        return builder.toUriString();
    }
}
