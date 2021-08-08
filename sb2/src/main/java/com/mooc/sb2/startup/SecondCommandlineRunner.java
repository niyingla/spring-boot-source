package com.mooc.sb2.startup;

import org.springframework.boot.CommandLineRunner;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Component
@Order(2)
public class SecondCommandlineRunner implements CommandLineRunner {
    /**
     * 项目启动后执行的功能 顺序 ApplicationRunner r> CommandLineRunner
     * @param args
     * @throws Exception
     */
    @Override
    public void run(String... args) throws Exception {
        System.out.println("\u001B[32m >>> startup second runner<<<");
    }
}
