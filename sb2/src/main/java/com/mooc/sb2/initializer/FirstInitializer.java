package com.mooc.sb2.initializer;

import org.springframework.context.ApplicationContextInitializer;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.core.annotation.Order;
import org.springframework.core.env.ConfigurableEnvironment;
import org.springframework.core.env.MapPropertySource;

import java.util.HashMap;
import java.util.Map;

@Order(1)
public class FirstInitializer implements ApplicationContextInitializer<ConfigurableApplicationContext> {
    @Override
    public void initialize(ConfigurableApplicationContext applicationContext) {
        ConfigurableEnvironment environment = applicationContext.getEnvironment();
        //设置上下文必备属性 spring启动时 会校验 没有会报错
        environment.setRequiredProperties("mooc");
//        Map<String, Object> map = new HashMap<>();
//        map.put("key1", "value1");
//        MapPropertySource mapPropertySource = new MapPropertySource("firstInitializer", map);
//        environment.getPropertySources().addLast(mapPropertySource);
//        System.out.println("run firstInitializer");
    }
}
