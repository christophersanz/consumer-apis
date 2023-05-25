package com.example.demoopenfeign.client;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;

@FeignClient(name="todoClient", url="https://jsonplaceholder.typicode.com")
public interface TodoClient {

  @GetMapping(value="/todos",consumes=MediaType.APPLICATION_JSON_VALUE)
  List<TodoModel> getTodos();

  @GetMapping(value = "/todos/{id}", consumes = MediaType.APPLICATION_JSON_VALUE)
  TodoModel getTodo(@PathVariable("id") Long id);

}
