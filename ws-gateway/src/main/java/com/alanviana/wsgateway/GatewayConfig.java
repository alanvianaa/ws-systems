package com.alanviana.wsgateway;

import org.springframework.cloud.gateway.route.RouteLocator;
import org.springframework.cloud.gateway.route.builder.RouteLocatorBuilder;
import org.springframework.cloud.netflix.hystrix.EnableHystrix;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@EnableHystrix
@Configuration
public class GatewayConfig {

    @Bean
    public RouteLocator Routes(RouteLocatorBuilder builder) {
        return builder.routes()

                .route("path_route", r -> r.path("/get")
                        .uri("http://httpbin.org"))
                .route("path_route", r -> r.path("/animais")
                        .uri("http://localhost:8083/animais"))

                .route("path_route", r -> r.path("/clientes")
                .uri("http://localhost:8082/clientes"))
                .build();

    }
}
