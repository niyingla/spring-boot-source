package com.mooc.sb2.condi;

import org.springframework.context.annotation.Condition;
import org.springframework.context.annotation.ConditionContext;
import org.springframework.core.type.AnnotatedTypeMetadata;
import org.springframework.util.StringUtils;


public class MyCondition implements Condition {
    @Override
    public boolean matches(ConditionContext context, AnnotatedTypeMetadata metadata) {
        //获取注解上配置的值
        String[] properties = (String[])metadata.getAnnotationAttributes("com.mooc.sb2.condi.MyConditionAnnotation").get("value");
        for (String property : properties) {
            if (StringUtils.isEmpty(context.getEnvironment().getProperty(property))) {
                return false;
            }
        }
        return true;
    }
}
