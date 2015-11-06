package com.example;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class AppController {
  @RequestMapping(value="/")
  public String home() {
    return "home";
  }
}
