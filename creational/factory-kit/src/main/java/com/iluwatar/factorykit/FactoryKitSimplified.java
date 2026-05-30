package com.iluwatar.factorykit;

import lombok.extern.slf4j.Slf4j;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Slf4j
public class FactoryKitSimplified {

  static class WeaponFactory {
    private final Map<WeaponType, Weapon> registry = new HashMap<>();

    // Registration
    public void register(WeaponType type, Weapon weapon) {
      registry.put(type, weapon);
    }

    // Creation
    public Weapon create(WeaponType type) {
      return registry.get(type);
    }
  }


  public static void main(String[] args) {
    // Create the factory
    WeaponFactory factory = new WeaponFactory();

    // Register builder/types in the client
    factory.register(WeaponType.AXE, new Axe());
    factory.register(WeaponType.SWORD, new Sword());
    factory.register(WeaponType.BOW, new Bow());
    factory.register(WeaponType.SPEAR, new Spear());

    // factory creates the required types
    List<Weapon> list = new ArrayList<>();
    list.add(factory.create(WeaponType.AXE));
    list.add(factory.create(WeaponType.SWORD));
    list.add(factory.create(WeaponType.BOW));
    list.add(factory.create(WeaponType.SPEAR));

    list.forEach(weapon -> LOGGER.info("{}", weapon.toString()));
  }

}
