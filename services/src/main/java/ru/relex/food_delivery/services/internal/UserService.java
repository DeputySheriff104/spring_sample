package ru.relex.food_delivery.services.internal;

import ru.relex.food_delivery.services.model.ExistingUser;
import ru.relex.food_delivery.services.model.NewUser;

public interface UserService {

  ExistingUser createUser(NewUser user);
}
