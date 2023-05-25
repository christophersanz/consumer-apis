package com.example.demowebclient.client;

import reactor.core.publisher.Flux;

public interface TodoWebClient {

  Flux<TodoResponse> getTodos();

}
