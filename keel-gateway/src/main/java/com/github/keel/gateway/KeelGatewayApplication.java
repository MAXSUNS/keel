package com.github.keel.gateway;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.Banner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.hystrix.EnableHystrix;
import org.springframework.cloud.netflix.hystrix.dashboard.EnableHystrixDashboard;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.security.config.annotation.method.configuration.EnableGlobalMethodSecurity;

@Slf4j
@EnableZuulProxy
@EnableFeignClients
@EnableDiscoveryClient
@EnableGlobalMethodSecurity(prePostEnabled = true)
@EnableHystrix                // 开启断路器
@EnableHystrixDashboard
@SpringBootApplication(exclude = DataSourceAutoConfiguration.class,scanBasePackages = {"com.github.keel.gateway", "com.github.keel.common.bean"})
public class KeelGatewayApplication {

    public static void main(String[] args) {
        log.debug("keelGatewayApplication startup main");
        SpringApplication application = new SpringApplication(KeelGatewayApplication.class);
        application.setBannerMode(Banner.Mode.OFF);
        application.run(args);
    }
}
