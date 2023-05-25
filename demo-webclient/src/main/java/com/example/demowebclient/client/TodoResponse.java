package com.example.demowebclient.client;

import lombok.*;

import java.io.Serializable;


@AllArgsConstructor
@Builder
@Getter
@NoArgsConstructor
@Setter
@ToString
public class TodoResponse implements Serializable {

  private static final long serialVersionUID = 1L;

  private String userId;
  private int id;
  private String title;
  private boolean completed;

}
