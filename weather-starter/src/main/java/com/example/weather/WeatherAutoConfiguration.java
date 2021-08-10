package com.example.weather;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Conditional;
import org.springframework.context.annotation.Configuration;

@Configuration
@EnableConfigurationProperties(WeatherSource.class)
@ConditionalOnProperty(name = "weather.enble",havingValue = "enable")
public class WeatherAutoConfiguration {
    @Autowired
    private WeatherSource weatherSource;

    @ConditionalOnMissingBean(WeatherService.class)
    public WeatherService weatherService(){
        return new WeatherService(weatherSource);
    }
}
