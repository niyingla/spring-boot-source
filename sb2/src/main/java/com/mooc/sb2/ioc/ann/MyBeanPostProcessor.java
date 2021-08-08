package com.mooc.sb2.ioc.ann;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.InstantiationAwareBeanPostProcessor;
import org.springframework.stereotype.Component;

@Component
public class MyBeanPostProcessor implements InstantiationAwareBeanPostProcessor {

    /**
     * registerBeanPostProcessors 找到BeanPostProcessor 排序后注入容器
     *
     * initMessageSource 初始化国际化属性
     *
     * initApplicationEventMulticaster 判断是否存在事件广播器 不存在就new一个
     *
     * onRefresh 刷新上下文
     *
     * registerListeners 注册监听器（之前设置的） earlyApplicationEvents 事件是当事件监听还没初始化就推送的事件，初始化之后会推送。
     *
     * finishBeanFactoryInitialization 初始化单实例bean
     *      初始化 org.springframework.beans.factory.support.DefaultListableBeanFactory#preInstantiateSingletons()
     *
     * finishRefresh 初始化生命周期处理器 并调用onRefresh
     *
     */

     /**
     *  bean 实例化前调用 （这里返回了对象实例 后面就不会被实例化了）
     * @param beanClass
     * @param beanName
     * @return
     * @throws BeansException
     */
    @Override
    public Object postProcessBeforeInstantiation(Class<?> beanClass, String beanName) throws BeansException {
        if (beanName.equals("worker")) {
            return new Worker();
        }
        return null;
    }
    /**
     *  bean 实例化后调用
     * @param beanName
     * @return
     * @throws BeansException
     */
    @Override
    public boolean postProcessAfterInstantiation(Object bean, String beanName) throws BeansException {
        if (beanName.equals("worker")) {
            Worker worker = (Worker) bean;
            worker.setName("wangwu");
        }
        return false;
    }
}
