package com.example.demo.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by ValkSam on 09.06.2017.
 */
@RestController
public class Controller {
  @RequestMapping("/hello")
  String home() {
    return "Hello World!";
  }
}
