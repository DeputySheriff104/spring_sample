package ru.relex.food_delivery.services.model;

import org.immutables.value.Value;

@Value.Immutable
public interface ExistingUser extends BaseUser {

  long getId();

  UserStatus getStatus();
}
