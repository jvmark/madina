package com.duitang.madina.framework.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * @author mark
 * @since 2016-10-10 16:57.
 */
@Controller
@RequestMapping("/")
public class HelloController {

  @RequestMapping(method = RequestMethod.GET)
  public String sayHello(Model model) {
    model.addAttribute("greeting", "Hello world from spring 4 mvc!!!");
    return "welcome";
  }

  @RequestMapping
  public String sayHelloAgain(Model model) {
    model.addAttribute("greeting", "Hello world again, spring 4 mvc!!!");
    return "welcome";
  }
}
