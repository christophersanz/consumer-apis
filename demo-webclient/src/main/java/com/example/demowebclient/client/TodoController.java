package com.example.demowebclient.client;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import reactor.core.Disposable;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@RestController
@RequestMapping("/api/client")
public class TodoController {

    private static final Logger logger = LoggerFactory.getLogger(TodoController.class);
    private static String valor = null;
    private static TodoResponse todoResponse = null;

    @Autowired
    private TodoWebClient client;

    @GetMapping(path = "/todos")
    public Flux<TodoResponse> getTodos() {
        return client.getTodos();
    }

    @GetMapping(path = "/todos/{id}")
    public Mono<TodoResponse> getTodo(@PathVariable("id") Long id) {
        System.out.println("downCache..");
        System.out.println("valor: " + valor);
        System.out.println("todoResponse: " + todoResponse);
        return client.getTodo(id);
    }

    @GetMapping(path = "/upcache/{id}")
    public Mono<TodoResponse> getUno(@PathVariable("id") Long id) {
        Mono<TodoResponse> mono = client.getTodo(id);
        ponerEnCache(mono);
        return mono;
    }

    private Disposable ponerEnCache(Mono<TodoResponse> mono) {
        return mono
            .doOnSuccess(response -> {
                valor = response.getTitle();
                todoResponse = response;
            }).subscribe();
    }

}
