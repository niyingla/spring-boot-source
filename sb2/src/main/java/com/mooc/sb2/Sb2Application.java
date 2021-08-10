package com.mooc.sb2;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.PropertySource;

import java.util.Properties;

@SpringBootApplication
@MapperScan("com.mooc.sb2.mapper")
//手动引入配置
@PropertySource("demo.properties")
public class Sb2Application {

	public static void main(String[] args) {
		Properties properties = new Properties();
		//设置默认属性
		SpringApplication springApplication = new SpringApplication(Sb2Application.class);
		properties.setProperty("wo.website.url", "wo_url");
		springApplication.setDefaultProperties(properties);
		springApplication.run(args);
	}

}
