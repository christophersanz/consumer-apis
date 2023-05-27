package com.example.demowebclient.client;

import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

public interface TodoWebClient {

  Flux<TodoResponse> getTodos();

  Mono<TodoResponse> getTodo(Long id);

}
