package com.mooc.sb2.ioc.ann;

import org.springframework.beans.BeansException;
import org.springframework.beans.MutablePropertyValues;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.beans.factory.config.BeanFactoryPostProcessor;
import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;
import org.springframework.stereotype.Component;

/**
 * 启动过程 invokeBeanFactoryPostProcessors 做了两件事
 * 1 调用 BeanDefinitionRegistryPostProcessor.postProcessBeanDefinitionRegistry
 * 向容器内添加bean定义
 * 2 调用 BeanFactoryPostProcessor.postProcessBeanFactory 向容器内添加bean属性
 *
 *
 *
 */
@Component
public class MyBeanFactoryPostprocessor implements BeanFactoryPostProcessor {

    /**
     * bean 实例化之前 添加一些bean属性值
     * @param beanFactory
     * @throws BeansException
     */
    @Override
    public void postProcessBeanFactory(ConfigurableListableBeanFactory beanFactory) throws BeansException {
        BeanDefinition teacher = beanFactory.getBeanDefinition("teacher");
        MutablePropertyValues propertyValues = teacher.getPropertyValues();
        propertyValues.addPropertyValue("name", "wangwu");
    }
}
