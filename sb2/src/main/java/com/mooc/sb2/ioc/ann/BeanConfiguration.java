package com.mooc.sb2.ioc.ann;

import com.mooc.sb2.ioc.xml.Animal;
import com.mooc.sb2.ioc.xml.Dog;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;


/**
 * 实现注解注入的四种方式
 * 1 @Component
 * 2 @Bean
 * 3 实现 BeanFactoryPostProcessor （bean 工厂）
 * 4 实现 BeanDefinitionRegistryPostProcessor （bean 定义）
 * 5 实现 FactoryBean
 * 6 实现 ImportBeanDefinitionRegistrar
 */
@Configuration
public class BeanConfiguration implements SuperConfiguration{

    @Bean("dog")
    Animal getDog() {
        return new Dog();
    }

}

