package com.example.playground.restoperations;

import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.client.RestOperations;

@Service
@RequiredArgsConstructor
public class PlaygroundService {

    private final RestOperations playgroundRestOperations;

    private final PlaygroundProperties playgroundProperties;

    public void post(PlaygroundObject playgroundObject) {
        playgroundRestOperations.postForObject(
                playgroundProperties.getUrl(),
                new HttpEntity<>(playgroundObject),
                String.class
        );
    }

}
