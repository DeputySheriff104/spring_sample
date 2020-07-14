package ru.relex.food_delivery.services.facade;

import ru.relex.food_delivery.services.facade.UserFacade;
import ru.relex.food_delivery.services.internal.UserService;
import ru.relex.food_delivery.services.model.ExistingUser;
import ru.relex.food_delivery.services.model.NewUser;

public class UserFacadeImpl implements UserFacade {

  private final UserService userService;

  public UserFacadeImpl(final UserService userService) {
    this.userService = userService;
  }

  @Override
  public ExistingUser createUser(final NewUser user) {
    return userService.createUser(user);
  }
}
