package com.example.demoopenfeign.client;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/client")
public class TodoController {

    @Autowired
    private TodoClient client;

    @GetMapping(path = "/todos")
    public List<TodoModel> getTodos() {
        return client.getTodos();
    }

    @GetMapping(path = "/todos/{id}")
    public TodoModel getTodo(@PathVariable("id") Long id) {
        return client.getTodo(id);
    }

}
