package ru.relex.food_delivery.services.internal.impl;

import org.springframework.beans.factory.annotation.Autowired;
import ru.relex.food_delivery.services.internal.UserService;
import ru.relex.food_delivery.services.mapper.UserMapper;
import ru.relex.food_delivery.services.model.ExistingUser;
import ru.relex.food_delivery.services.model.NewUser;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.atomic.AtomicLong;

public class UserServiceImpl implements UserService {

  private final Map<Long, ExistingUser> USERS = new HashMap<>();

  private final AtomicLong lastId = new AtomicLong(0);

  private final UserMapper userMapper;

  @Autowired
  public UserServiceImpl(final UserMapper userMapper) {
    this.userMapper = userMapper;
  }


  @Override
  public ExistingUser createUser(final NewUser user) {
    // Выделить ID для пользователя
    long newId = lastId.addAndGet(1);

    // Преобразовать NewUser в ExistingUser
    ExistingUser existingUser = userMapper.fromNewUser(user, newId);

    // Сохрнаить в HashMap
    USERS.put(newId, existingUser);

    // Вернуть ExistingUser клиенту
    return existingUser;
  }

}
