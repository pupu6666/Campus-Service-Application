package com.XyDp;

import com.alibaba.csp.sentinel.annotation.aspectj.SentinelResourceAspect;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@EnableAspectJAutoProxy(exposeProxy = true)
@MapperScan("com.XyDp.mapper")
@SpringBootApplication
public class XyDianPingApplication {

    public static void main(String[] args) {
        SpringApplication.run(XyDianPingApplication.class, args);
    }

//    @Bean
//    public SentinelResourceAspect sentinelResourceAspect() {
//        return new SentinelResourceAspect();
//    }
}
