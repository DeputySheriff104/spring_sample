package ru.relex.food_delivery.rest;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Import;
import ru.relex.food_delivery.services.ServicesConfiguration;

@SpringBootApplication
@Import(ServicesConfiguration.class)
public class SampleApp {

  public static void main(String[] args) {
    SpringApplication.run(SampleApp.class, args);
  }
}
