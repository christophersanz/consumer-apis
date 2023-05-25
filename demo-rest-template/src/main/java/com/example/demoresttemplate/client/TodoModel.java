package com.example.demoresttemplate.client;

import lombok.*;

@AllArgsConstructor
@Builder
@Getter
@NoArgsConstructor
@Setter
@ToString
public class TodoModel {

  private String userId;
  private int id;
  private String title;
  private boolean completed;

}
