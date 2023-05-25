package com.example.demowebclient.client;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Flux;

@RestController
@RequestMapping("/api/client")
public class TodoController {

    @Autowired
    private TodoWebClient client;

    @GetMapping(path = "/todos")
    public Flux<TodoResponse> getTodos() {
        return client.getTodos();
    }

}
