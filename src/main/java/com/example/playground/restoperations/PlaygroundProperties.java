package com.example.playground.restoperations;

import lombok.Data;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
@Data
public class PlaygroundProperties {

    @Value("${application.rest-operations.url}")
    private String url;
}
