package com.example.playground.restoperations;

import okhttp3.mockwebserver.MockResponse;
import okhttp3.mockwebserver.MockWebServer;
import org.junit.jupiter.api.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;

import java.io.IOException;
import java.util.UUID;

import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;

@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT,
        properties = {"application.rest-operations.url=http://localhost:4999/playground"})
@ActiveProfiles({"test"})
class ReusedMockWebServerPlaygroundServiceTest {

    private static final UUID ID = UUID.fromString("00000000-0000-0000-0000-000000000000");

    @Autowired
    private PlaygroundService playgroundService;

    private static MockWebServer mockWebServer;

    @BeforeAll
    static void setUp() throws IOException {
        mockWebServer = new MockWebServer();
        mockWebServer.start(4999);
    }

    @AfterAll
    static void tearDown() throws IOException {
        mockWebServer.shutdown();
    }

    @Test
    void post_1() {
        mockWebServer.enqueue(new MockResponse().setResponseCode(200).setHeader("Content-Type", "application/json")
                .setBody("{\"acceptedRequests\":1}"));

        assertDoesNotThrow(() ->
                playgroundService.post(PlaygroundObject.builder().id(ID).build()));
    }

    @Test
    void post_2() {
        mockWebServer.enqueue(new MockResponse().setResponseCode(200).setHeader("Content-Type", "application/json")
                .setBody("{\"acceptedRequests\":1}"));

        assertDoesNotThrow(() ->
                playgroundService.post(PlaygroundObject.builder().id(ID).build()));
    }

    @Test
    void post_3() {
        mockWebServer.enqueue(new MockResponse().setResponseCode(200).setHeader("Content-Type", "application/json")
                .setBody("{\"acceptedRequests\":1}"));

        assertDoesNotThrow(() ->
                playgroundService.post(PlaygroundObject.builder().id(ID).build()));
    }

    @Test
    void post_4() {
        mockWebServer.enqueue(new MockResponse().setResponseCode(200).setHeader("Content-Type", "application/json")
                .setBody("{\"acceptedRequests\":1}"));

        assertDoesNotThrow(() ->
                playgroundService.post(PlaygroundObject.builder().id(ID).build()));
    }
}
