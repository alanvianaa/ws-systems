package com.alanviana.wsgateway;

import org.springframework.cloud.gateway.route.RouteLocator;
import org.springframework.cloud.gateway.route.builder.RouteLocatorBuilder;
import org.springframework.cloud.netflix.hystrix.EnableHystrix;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class GatewayConfig {

    @Bean
    public RouteLocator Routes(RouteLocatorBuilder builder) {


        return builder.routes()

                .route("path_route", r -> r.path("/login")

                        .uri("http://localhost:8082/login"))

                .route("path_route", r -> r.path("/animais")
                        .uri("http://localhost:8083/animais"))

                .route("path_route", r -> r.path("/clientes")
                        .filters(f -> f.addRequestHeader("Content-Type", "application/json")
                                        .addRequestHeader("Authorization", "Bearer eyJhbGciOiJIUzUxMiJ9.eyJzdWIiOiJhbmFAZ21haWwuY29tIiwiZXhwIjoxNTcyODAzMTEwfQ.1iwuoyB8w060RzRmn6FF2HOOGOEL-g7Xhlk78RAcpN1mZL1bRIwT2fgtAiz6pfB4b51gyu2Tsh8L4izSSjPBdg")
                                        .hystrix(config -> config.setName("user-security")
                                                .setFallbackUri("forward:/fallback")))
                        .uri("http://localhost:8082/clientes")
                )
                .build();

    }
}
