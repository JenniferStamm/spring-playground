package com.example.playground.restoperations;

import lombok.RequiredArgsConstructor;
import org.apache.hc.client5.http.impl.classic.HttpClients;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.client.HttpComponentsClientHttpRequestFactory;
import org.springframework.web.client.RestOperations;
import org.springframework.web.client.RestTemplate;

@Configuration
@RequiredArgsConstructor
public class PlaygroundRestOperationsConfig {

    private final PlaygroundProperties properties;

    @Bean
    public RestOperations playgroundMeteringRestOperations() {
        var httpClient = HttpClients.custom().build();
        var requestFactory = new HttpComponentsClientHttpRequestFactory(httpClient);
        return new RestTemplate(requestFactory);
    }

}
