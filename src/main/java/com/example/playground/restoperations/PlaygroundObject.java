package com.example.playground.restoperations;

import lombok.Builder;
import lombok.Data;

import java.util.UUID;

@Data
@Builder
public class PlaygroundObject {

    private UUID id;

}
