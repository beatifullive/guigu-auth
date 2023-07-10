package com.atguigu.system;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @projectName: guigu-auth
 * @package: com.atguigu.system
 * @className: ServiceAuthApplication
 * @author: Awphl
 * @description: TODO
 * @date: 2023-07-09 17:01
 * @version: 1.0
 */
@SpringBootApplication
@MapperScan("com.atguigu.system.mapper")
public class ServiceAuthApplication {
        public static void main(String[] args) {
        SpringApplication.run(ServiceAuthApplication.class, args);
        }

}
