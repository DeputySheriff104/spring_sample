package ru.relex.food_delivery.services.facade;

import ru.relex.food_delivery.services.model.ExistingUser;
import ru.relex.food_delivery.services.model.NewUser;

public interface UserFacade {

  ExistingUser createUser(NewUser user);
}
