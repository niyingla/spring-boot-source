package com.mooc.sb2.condi;

import org.springframework.context.annotation.Conditional;

import java.lang.annotation.*;

@Target({ ElementType.TYPE, ElementType.METHOD })
@Retention(RetentionPolicy.RUNTIME)
@Documented
//指定匹配配置类
@Conditional(MyCondition.class)
public @interface MyConditionAnnotation {

    String[] value() default {};

}
