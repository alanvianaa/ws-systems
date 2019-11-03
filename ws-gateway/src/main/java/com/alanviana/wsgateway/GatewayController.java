package com.alanviana.wsgateway;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Mono;

@RestController
public class GatewayController {

    @RequestMapping("/fallback")
    public Mono<String> countries() {
        return Mono.just("Parece que esse microcervice está desligado. Tente novamente mais tarde. Bla bla bla");
    }

}
