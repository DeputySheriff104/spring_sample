package ru.relex.food_delivery.services.mapper;

import org.immutables.value.Value;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Qualifier;
import ru.relex.food_delivery.services.model.ExistingUser;
import ru.relex.food_delivery.services.model.ImmutableUserStatus;
import ru.relex.food_delivery.services.model.NewUser;
import ru.relex.food_delivery.services.model.UserStatus;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

@Mapper
public interface UserMapper {

  @Qualifier
  @Retention(RetentionPolicy.CLASS)
  @interface DefaultStatusMapper {
  }

  @Mapping(target = "id", source = "newId")
  @Mapping(target = "status", source = "user", qualifiedBy = DefaultStatusMapper.class)
  ExistingUser fromNewUser(NewUser user, long newId);

  @DefaultStatusMapper
  default UserStatus defaultStatusMapper(@SuppressWarnings("unused") NewUser user) {
    return ImmutableUserStatus
      .builder()
      .build();
  }

}
