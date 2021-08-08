package com.mooc.sb2.pro;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.EnvironmentAware;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Component;

/**
 * CommandLineRunner 启动后调用
 * EnvironmentAware 注入环境变量
 * Aware 自定义注入 和 @autowired类似
 *
 */
@Component
public class ResultCommandLineRunner implements CommandLineRunner, EnvironmentAware, MyAware {

    private Environment env;

    private Flag flag;

    @Override
    public void run(String... args) throws Exception {
        System.out.println(env.getProperty("mooc.defalut.name"));
        System.out.println(env.getProperty("mooc.active.name"));
    }

    @Override
    public void setEnvironment(Environment environment) {
        env = environment;
    }

    @Override
    public void setFlag(Flag fla) {
        flag = fla;
    }
}
