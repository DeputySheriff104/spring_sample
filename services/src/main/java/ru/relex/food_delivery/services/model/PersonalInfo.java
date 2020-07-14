package ru.relex.food_delivery.services.model;

import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import org.immutables.value.Value;
import org.springframework.lang.Nullable;

@Value.Immutable
@JsonDeserialize(builder = ImmutablePersonalInfo.Builder.class)
public interface PersonalInfo {

  String getFirstName();

  String getLastName();

  String getEmail();

  @Nullable
  String getPhone();

}
