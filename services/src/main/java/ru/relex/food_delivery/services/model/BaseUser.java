package ru.relex.food_delivery.services.model;

public interface BaseUser {

  Role getRole();

  PersonalInfo getPersonalInfo();

  String getUserName();
}
