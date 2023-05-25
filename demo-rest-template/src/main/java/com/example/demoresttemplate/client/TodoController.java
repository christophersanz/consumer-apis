package com.example.demoresttemplate.client;

import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.util.Arrays;
import java.util.List;

@RestController
@RequestMapping("/api/client")
public class TodoController {

    RestTemplate restTemplate = new RestTemplate();

    @GetMapping(path = "/todos")
    public List<TodoModel> getTodos() {

        TodoModel[] todosArray = restTemplate.getForObject("https://jsonplaceholder.typicode.com/todos", TodoModel[].class);
        List<TodoModel> emp= Arrays.asList(todosArray);
        return emp;

    }


}
