package ru.relex.sample.rest.api;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/hello-world")
public class HelloWorldApi {

  @GetMapping(produces = "text/plain", path = "/{home}")
  public String sayHello(
    @PathVariable(value = "home") final String home,
    @RequestParam(value = "user") final String user
  ) {
    return "Hello, " + user + "!";
  }
}
