package ru.relex.food_delivery.rest.api;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import ru.relex.food_delivery.services.model.NewUser;
import ru.relex.food_delivery.services.facade.UserFacade;

@RestController
@RequestMapping(
  value = "/users",
  consumes = "application/json",
  produces = "application/json")
public class UserApi {

  private static final Logger logger = LoggerFactory.getLogger(UserApi.class);

  private final UserFacade userFacade;

  @Autowired
  public UserApi(final UserFacade userFacade) {
    this.userFacade = userFacade;
  }

  @PostMapping(consumes = "application/json")
  @ResponseStatus(HttpStatus.CREATED)
  void createUser(@RequestBody NewUser user) {
    logger.info("Consumed: {}", user);

    userFacade.createUser(user);
  }
}
