package com.orange;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @className: MybatisPlusDemo
 * @description: TODO 类描述
 * @author: Txc
 * @date: 2022/12/14 15:19
 **/
@SpringBootApplication
//@MapperScan("com.orange.dao")
public class MybatisPlusDemo {

    public static void main(String[] args) {
        SpringApplication.run(MybatisPlusDemo.class, args);
    }

}
