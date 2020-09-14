package com.greenfoxacademy.springstart.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class MainController {

  @ResponseBody
  @RequestMapping(value="/hello", method= RequestMethod.GET)
  public String hello() {
    return "Hello World";
  }
}
