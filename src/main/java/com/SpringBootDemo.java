package com;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

/**
 * @author 李天赐
 * 2021/11/24
 */
@SpringBootApplication
@ComponentScan("com.controller")
public class SpringBootDemo {

    public static void main(String[] args) {
        //默认读取classpath目录下的application.properties或者.yml
        SpringApplication.run(SpringBootDemo.class,args);
    }
}
