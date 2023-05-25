package com.example.demowebclient.client;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Repository;
import org.springframework.web.reactive.function.client.WebClient;
import reactor.core.publisher.Flux;

@RequiredArgsConstructor
@Repository
@Slf4j
public class TodoWebClientImpl implements TodoWebClient {


  @Override
  public Flux<TodoResponse> getTodos() {
    WebClient client = WebClient.create("https://jsonplaceholder.typicode.com");
    return client
        .get()
        .uri("/todos")
        .retrieve()
        .bodyToFlux(TodoResponse.class);
  }

}
