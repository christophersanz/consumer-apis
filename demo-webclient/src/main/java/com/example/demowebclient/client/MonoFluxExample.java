package com.example.demowebclient.client;

import reactor.core.publisher.Mono;

public class MonoFluxExample {

    public static void main(String[] args) {
        Mono.just("Hello")
                .flatMap(value -> {
                    System.out.println("First Mono: " + value);
                    return callAnotherMono(value);
                })
                .subscribe(result -> {
                    System.out.println("Final result: " + result);
                });
    }

    public static Mono<String> callAnotherMono(String value) {
        System.out.println("Calling another Mono with value: " + value);
        return Mono.just(value + " World!");
    }
}