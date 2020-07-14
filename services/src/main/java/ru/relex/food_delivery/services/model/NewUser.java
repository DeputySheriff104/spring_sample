package ru.relex.food_delivery.services.model;

import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import org.immutables.value.Value;

@Value.Immutable
@JsonDeserialize(builder = ImmutableNewUser.Builder.class)
@Value.Style(redactedMask = "*****")
public interface NewUser extends BaseUser {

  @Value.Redacted
  String getPassword();

}
